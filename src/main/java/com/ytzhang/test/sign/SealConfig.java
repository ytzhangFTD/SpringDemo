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
 *  类SealConfig的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 15:59
 * </pre>
 */
public class SealConfig extends SignConfig {
    private String sealKey;
    private String sealSecret;

    public String getSealKey() {
        return sealKey;
    }

    public void setSealKey(String sealKey) {
        this.sealKey = sealKey;
    }

    public String getSealSecret() {
        return sealSecret;
    }

    public void setSealSecret(String sealSecret) {
        this.sealSecret = sealSecret;
    }
}
