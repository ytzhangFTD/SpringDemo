package com.ytzhang.test.maintest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Administrator
 * 2016/7/20
 */
public class MainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
}
