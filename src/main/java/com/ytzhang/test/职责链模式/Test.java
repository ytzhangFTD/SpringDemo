package com.ytzhang.test.职责链模式;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Administrator 2017/4/24
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ManagerHandler managerHandler = (ManagerHandler) ctx.getBean("managerHandler");
        CeoHandler ceoHandler = (CeoHandler) ctx.getBean("ceoHandler");
        Integer amount = 1000;
        managerHandler.handleRequest(amount);
    }
}
