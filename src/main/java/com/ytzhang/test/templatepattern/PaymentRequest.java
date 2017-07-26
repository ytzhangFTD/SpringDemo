package com.ytzhang.test.templatepattern;
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
 *  类PaymentRequest的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 15:53
 * </pre>
 */
public class PaymentRequest {
    private Map<String, String> params;

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
