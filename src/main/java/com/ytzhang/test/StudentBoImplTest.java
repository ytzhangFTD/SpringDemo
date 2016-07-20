package com.ytzhang.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ytzhang.test.Bo.StudentBo;
import com.ytzhang.test.mybatis.model.Do.Student;

/**
 * StudentBoImpl Tester.
 * 
 * @author <wb-zhangyitong>
 * @version 1.0
 */
public class StudentBoImplTest {

    /**
     * PROPAGATION_REQUIRED: 如果存在一个事务，则支持当前事务。如果没有事务则开启
	 * PROPAGATION_SUPPORTS: 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行
	 * PROPAGATION_MANDATORY: 如果已经存在一个事务，支持当前事务。如果没有一个活动的事务，则抛出异常。
	 * PROPAGATION_REQUIRES_NEW: 总是开启一个新的事务。如果一个事务已经存在，则将这个存在的事务挂起。
	 * PROPAGATION_NOT_SUPPORTED: 总是非事务地执行，并挂起任何存在的事务。
	 * PROPAGATION_NEVER: 总是非事务地执行，如果存在一个活动事务，则抛出异常
	 * PROPAGATION_NESTED：如果一个活动的事务存在，则运行在一个嵌套的事务中. 如果没有活动事务, 则按TransactionDefinition.PROPAGATION_REQUIRED 属性执行
     */

    @BeforeClass
    public void before() throws Exception {
    }

    @AfterClass
    public void after() throws Exception {
    }

    /**
     * Method: addUser(Student user)
	 * A调用方法methodA，methodA调用B的methodB，methodA和methodB都声明事务传播特性为REQUIRED
     * 在methodA中对产生异常的methodB，catch异常
	 * 运行结果，报错 Transaction rolled back because it has been marked as rollback-only
	 * 原因：两个类共用一个事务，B调用失败时已经将事务标记为回滚，但是A catch了异常，并提交了事务，这时候发现事务已经被标记为回滚了，就会报错。
     */
    @Test(groups = "ytzhang", enabled = true)
    public void testAddUser() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentBo studentBo = (StudentBo) applicationContext.getBean("studentBo");
        Student user = new Student("student1");
        studentBo.addUser(user);
    }

    /**
     * Method: addUser2(Student user)
	 * A中有两个方法，methodA和methodB，methodA和methodB都声明事务传播特性为REQUIRED且methodA调用methodB
     * 在methodA中对产生异常的methodB，catch异常
	 * 运行结果 methodA数据新建成功，methodB数据也新建成功
     */
    @Test(groups = "ytzhang", enabled = true)
    public void testAddUser2() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentBo studentBo = (StudentBo) applicationContext.getBean("studentBo");
        Student user = new Student("student2");
        studentBo.addUser2(user);
    }
}
