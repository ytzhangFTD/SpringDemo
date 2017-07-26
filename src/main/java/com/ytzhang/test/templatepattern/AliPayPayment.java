package com.ytzhang.test.templatepattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类AliPayPayment的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 16:26
 * </pre>
 */
public class AliPayPayment extends AbstractPayment {
    public AliPayPayment(String name) {
        super(name);
    }

    @Override
    public boolean bizValid(PaymentRequest request) {
        return true;
    }

    @Override
    public void bizHandler(PaymentResult result) {
        System.out.println(this.getName() + " bizHandler " + result);
    }
}
