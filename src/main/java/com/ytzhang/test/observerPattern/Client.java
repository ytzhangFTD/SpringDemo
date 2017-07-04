package com.ytzhang.test.observerPattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类Client的实现描述：
 *  @author wb-zhangyitong  2017/7/4 15:31
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Stock stock = new Stock("梦想", 10);
        Investor tom = new Investor("tom");
        stock.attach(tom);
        stock.update(20L);
        Investor jack = new Investor("jack");
        stock.attach(jack);
        stock.update(400L);
        stock.detach(jack);
        stock.update(5L);
    }
}
