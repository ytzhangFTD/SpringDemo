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
 *  类Abstraction的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/10 9:45
 * </pre>
 */
public abstract class Abstraction implements Implementor {

    protected Implementor implementor;

    private String system;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSystem() {
        return system;
    }

    public abstract void display();
}
