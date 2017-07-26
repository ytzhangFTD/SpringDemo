package com.ytzhang.test.sign;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

/**
 * <pre>
 *  类SignConfig的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2017/7/13 15:57
 * </pre>
 */
public class SignConfig {
    /**
     * 配置名称
     */
    private String name;
    /**
     * sign类型
     */
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
