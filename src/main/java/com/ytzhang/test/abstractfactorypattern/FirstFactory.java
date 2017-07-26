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
 *  类FirstFactory的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/7 10:09
 * </pre>
 */
public class FirstFactory extends AbstractFactory {
    @Override
    public AbstractProduct createProductA() {
        System.out.println("FirstFactory create ProductA ");
        return new ProductA();
    }

    @Override
    public AbstractProduct createProductB() {
        System.out.println("FirstFactory create ProductB ");
        return new ProductB();
    }

    @Override
    public AbstractProduct createProductC() {
        System.out.println("FirstFactory create ProductC ");
        return new ProductC();
    }
}
