package com.ytzhang.test.batchload.loader;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.List;

import com.ytzhang.test.batchload.model.SuitEntity;
import org.springframework.core.io.Resource;

/**
 * <pre>
 *  类SuitEntityLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/1 11:04
 * </pre>
 */
public class SuitEntityLoader extends AbstractLassenLoader<SuitEntity> {

    @Override
    public List<SuitEntity> analyze(Resource resource) {
        return super.analyze(resource);
    }

    @Override
    public void save(List<SuitEntity> collection) {
        super.save(collection);
    }

    @Override
    public void save(SuitEntity data) {
        super.save(data);
    }
}