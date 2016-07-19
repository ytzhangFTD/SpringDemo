package com.ytzhang.test;

import com.ytzhang.test.aop.Bussiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Administrator
 * 2016/7/20
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Bussiness testBussiness = (Bussiness) applicationContext.getBean("testBussiness");
		testBussiness.test();
	}
}
