package com.ytzhang.test.batchload2;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.Map;

/**
 * <pre>
 *  类Request的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/2 9:16
 * </pre>
 */
public class Request {
    private int batch;

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    private Map<String, String> dataMap;

    public Map<String, String> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, String> dataMap) {
        this.dataMap = dataMap;
    }
}
