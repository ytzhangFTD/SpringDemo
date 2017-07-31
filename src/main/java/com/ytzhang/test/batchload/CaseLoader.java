package com.ytzhang.test.batchload;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.List;

/**
 * <pre>
 *  类CaseLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:45
 * </pre>
 */
public class CaseLoader extends AbstractLassenLoader<LegalCase> {
    @Override
    public void save(List<LegalCase> collection) {
        super.save(collection);
        System.out.println("save legalcase collection");
    }

    @Override
    public void save(LegalCase data) {
        System.out.println("save legalcase");
    }
}
