package com.ytzhang.test.maintest;

import com.ytzhang.test.aop.Bussiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2016/5/13.
 */
public class SpringAOPTest {
    /**
     * spring AOP 功能实现原理 测试类
     */
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("ApplicationContext.xml");
//                new FileSystemXmlApplicationContext("ApplicationContext.xml");
        Bussiness bussiness = (Bussiness) ctx.getBean("testBussiness");
        bussiness.test();

    }
}
