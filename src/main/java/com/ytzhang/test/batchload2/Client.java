package com.ytzhang.test.batchload2;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/2 9:30
 * </pre>
 */
public class Client {
    private static ApplicationContext context;

    private static Handler caseHandler;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext(new String[] {"classpath:application-test.xml"});
        caseHandler= (Handler)context.getBean("caseHandler");
    }
    @Test
    public void test(){
        Request request=new Request();
        caseHandler.handle(request);
    }

}
