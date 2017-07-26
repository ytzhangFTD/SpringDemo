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
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 16:00
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        WaterMarkConfig config = new WaterMarkConfig();
        config.setUrl("waterConfigUrl");
        config.setType("waterMark");
        SignRequest signRequest = new SignRequest();
        signRequest.setSignConfig(config);
        Sign warterSign = new WaterMarkSign();
        SignResult signResult = warterSign.sign(signRequest);
        if (signResult.isSuccess()) {

        }
    }
}
