package com.ytzhang.test.abstractfactorypattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类AlipayTradeExtParam的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/12 16:12
 * </pre>
 */
public class AlipayTradeExtParam extends AlipayExtParam {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
