package com.ytzhang.test.visitor;
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
 *  @author wb-zhangyitong  2017/8/3 15:46
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Element elementA = new ElementA();
        Element elementB = new ElementB();
        Visitor visitor = new VisitorA();
        ElementList list = new ElementList();
        list.add(elementA);
        list.add(elementB);
        list.accept(visitor);
    }
}
