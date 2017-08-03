package com.ytzhang.test.batchload2;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.Map;

/**
 * <pre>
 *  类Thread的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/3 9:50
 * </pre>
 */
public class MyThread implements Runnable {
    private Request request;
    private Handler handler;

    public MyThread(Request request, Handler handler) {
        this.request = request;
        this.handler = handler;
    }

    @Override
    public synchronized void run() {
        handler.handle(request);
    }
}
