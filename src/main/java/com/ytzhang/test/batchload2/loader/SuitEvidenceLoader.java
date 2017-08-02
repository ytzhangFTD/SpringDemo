package com.ytzhang.test.batchload2.loader;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.List;

import com.ytzhang.test.batchload.model.SuitEvidence;
import org.springframework.core.io.Resource;

/**
 * <pre>
 *  类SuitEvidenceLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/2 9:21
 * </pre>
 */
public class SuitEvidenceLoader implements Loader<SuitEvidence> {
    @Override
    public List<SuitEvidence> load(Resource resource) {
        System.out.println("证据读取：resource 从zip中读取");
        System.out.println("SuitEvidenceLoader load");
        return null;
    }
}
