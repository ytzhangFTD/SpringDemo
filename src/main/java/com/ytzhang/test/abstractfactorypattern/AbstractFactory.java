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
 *  类AbstractFactory的实现描述：
 *  抽象factory类
 *  @author wb-zhangyitong  2017/7/7 10:05
 * </pre>
 */
public abstract class AbstractFactory {
    public abstract AbstractProduct createProductA();

    public abstract AbstractProduct createProductB();

    public abstract AbstractProduct createProductC();
}
