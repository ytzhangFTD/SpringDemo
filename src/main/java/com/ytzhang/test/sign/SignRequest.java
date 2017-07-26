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
 *  类SignRequest的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 16:32
 * </pre>
 */
public class SignRequest {
    private String fileType;
    private String fileUrl;
    private SignConfig signConfig;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public SignConfig getSignConfig() {
        return signConfig;
    }

    public void setSignConfig(SignConfig signConfig) {
        this.signConfig = signConfig;
    }
}
