package com.ytzhang.test.observerpattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类Investor的实现描述：
 *  股民
 *  @author wb-zhangyitong  2017/7/4 15:33
 * </pre>
 */
public class Investor extends Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + "：赶紧看一看啊，股票有波动");
    }
}
