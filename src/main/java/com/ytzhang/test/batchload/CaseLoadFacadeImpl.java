package com.ytzhang.test.batchload;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 *  类CaseLoadFacadeImpl的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:53
 * </pre>
 */
public class CaseLoadFacadeImpl implements CaseLoadFacade {
    @Autowired
    private AbstractLassenLoader caseLoader;
    @Autowired
    private AbstractLassenLoader caseOtherLoader;

    @Override
    public void saveCase(List<LegalCase> cases) {
        caseLoader.save(cases);
    }

    @Override
    public void saveCaseOther(List<LegalCaseOther> caseOthers) {
        caseOtherLoader.save(caseOthers);

    }
}
