package com.ytzhang.test.batchload;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.List;

import org.springframework.core.io.Resource;

/**
 * <pre>
 *  类AbstractLassenLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:35
 * </pre>
 */
public abstract class AbstractLassenLoader<T> implements LassenLoader<T> {
    @Override
    public Resource load(String path) {
        return null;
    }

    @Override
    public List<T> analyze(Resource resource) {
        return null;
    }

    @Override
    public void save(List<T> collection) {

    }

    @Override
    public void save(T data) {

    }
}
