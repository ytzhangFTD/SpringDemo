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
 *  类VisitorA的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/3 16:50
 * </pre>
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("visitorA visit elementA ");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("visitorA visit elementB ");

    }
}
