package com.ytzhang.test.bridge;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/10 9:55
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Abstraction action = new RefinedAbstraction();
        Implementor implementor = new ImplementorB();
        action.setImplementor(implementor);
        action.setSystem("linux");
        action.operation();
        action.display();
    }
}
