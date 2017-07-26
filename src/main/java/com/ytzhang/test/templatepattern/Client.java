package com.ytzhang.test.templatepattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.HashMap;

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 16:28
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        AliPayPayment payment = new AliPayPayment("alipay");
        payment.setValid(false);
        PaymentRequest request = new PaymentRequest();
        request.setParams(new HashMap<String, String>());
        payment.execute(request);
    }
}
