package com.ytzhang.test.strategypattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类SearchStrategy的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 14:29
 * </pre>
 */
public class SearchStrategy extends AbstractStrategy {
    private String name;

    public SearchStrategy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("执行 " + this.name + " 策略");
    }
}
