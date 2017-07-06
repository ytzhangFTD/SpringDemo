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
 *  类AbstractStrategy的实现描述：
 *  抽象策略类
 *  @author wb-zhangyitong  2017/7/6 11:23
 * </pre>
 */
public abstract class AbstractStrategy {
    /**
     * 策略的执行方法
     */
    public abstract void print();
}
