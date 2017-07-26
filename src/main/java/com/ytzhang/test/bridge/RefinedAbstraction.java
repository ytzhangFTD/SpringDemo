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
 *  类RefinedAbstraction的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/10 9:46
 * </pre>
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void display() {
        if ("windows".equals(this.getSystem())) {
            System.out.println("windows display");
        } else if ("linux".equals(this.getSystem())) {
            System.out.println("linux display");
        } else if ("mac".equals(this.getSystem())) {
            System.out.println("mac display");
        }
    }

    public void operation() {
        implementor.operation();
    }
}
