package com.ytzhang.test;

import com.ytzhang.test.Bo.StudentBo;
import com.ytzhang.test.mybatis.model.Do.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * StudentBoImpl Tester.
 * 
 * @author <wb-zhangyitong>
 * @version 1.0
 */
public class StudentBoImplTest {

    @BeforeClass
    public void before() throws Exception {
    }

    @AfterClass
    public void after() throws Exception {
    }

    /**
     * Method: addUser(Student user)
     */
    @Test(groups = "ytzhang", enabled = true)
    public void testAddUser() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentBo studentBo = (StudentBo) applicationContext.getBean("userBo");
        Student user = new Student();
        user.setName("student1");
        studentBo.addUser(user);
    }
}
