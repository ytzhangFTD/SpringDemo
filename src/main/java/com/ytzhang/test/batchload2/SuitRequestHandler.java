package com.ytzhang.test.batchload2;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类SuitRequestHandler的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/2 15:23
 * </pre>
 */
public class SuitRequestHandler extends AbstractHandler {
    @Override
    public void bizHandler(Request request) {
        System.out.println("suitRequestHandler success!");
    }
}
