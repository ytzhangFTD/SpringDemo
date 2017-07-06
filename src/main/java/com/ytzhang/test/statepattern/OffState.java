package com.ytzhang.test.statepattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类OffState的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 17:31
 * </pre>
 */
public //关闭状态
class OffState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭！");
    }
}
