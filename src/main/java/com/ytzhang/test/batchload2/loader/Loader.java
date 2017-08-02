package com.ytzhang.test.batchload2.loader;
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
 *  类Loader的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2017/8/2 9:22
 * </pre>
 */
public interface Loader<T> {
    List<T> load(Resource resource);
}
