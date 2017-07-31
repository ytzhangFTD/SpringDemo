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
 *  类LassenLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:29
 * </pre>
 */
public interface LassenLoader<T> {
    /**
     * 加载文件
     *
     * @param path
     * @return
     */
    Resource load(String path);

    /**
     * 解析资源
     *
     * @param resource
     * @return
     */
    List<T> analyze(Resource resource);

    /**
     * 批量保存
     *
     * @param collection
     */
    void save(List<T> collection);

    /**
     * 保存
     *
     * @param data
     */
    void save(T data);

}
