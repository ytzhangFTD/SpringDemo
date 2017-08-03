package com.ytzhang.test.batchload2;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
        caseHandler = (Handler)context.getBean("validHandler");
    }

    @Test
    public void test() throws InterruptedException {
        Request request = new Request();
        Map<String, String> dataMap = new HashMap<String, String>();
        for (int i = 0; i < 100; i++) {
            dataMap.put(i + "", "test" + i);
        }
        request.setDataMap(dataMap);
        List<Request> requestList = diviceRequest(request);
        long before = System.currentTimeMillis();
        for (Request t : requestList) {
            MyThread myThread = new MyThread(t,caseHandler);
            Thread thread=new Thread(myThread);
            thread.start();
        }
        long after = System.currentTimeMillis();
        long l = after - before;
        System.out.println("thread1 ");
        Thread.sleep(1000L);
    }

    @Test
    public void test2() {
    }

    private List<Request> diviceRequest(Request request) {
        List<Request> requestList = new ArrayList<Request>(10);
        Map<String, String> dataMap = request.getDataMap();
        int i = 0;
        Map<String, String> dataTemp = null;
        Request requestTemp = null;
        for (Entry<String, String> entry : dataMap.entrySet()) {
            if (i % 10 == 0) {
                dataTemp = new HashMap<String, String>();
                requestTemp = new Request();
            }
            dataTemp.put(entry.getKey(), entry.getValue());
            requestTemp.setBatch(i % 10);
            if (i % 10 == 0) {
                requestTemp.setDataMap(dataTemp);
                requestList.add(requestTemp);
            }
            i++;
        }
        return requestList;

    }

}
