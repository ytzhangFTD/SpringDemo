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
 *  类ValidHandler的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/2 15:23
 * </pre>
 */
public class ValidHandler extends AbstractHandler {
    @Override
    public void bizHandler(Request request) {
        System.out.println("valid request batch " + request.getBatch());
        Map<String, String> dataMap = request.getDataMap();
        for (String s : dataMap.keySet()) {
            System.out.println(Thread.currentThread().getName() + " valid handler " + s + " success");
        }
    }
}
