package com.ytzhang.test.visitorpattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类Element的实现描述：
 *  抽象被访问元素
 *  @author wb-zhangyitong  2017/7/6 16:24
 * </pre>
 */
public abstract class Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
