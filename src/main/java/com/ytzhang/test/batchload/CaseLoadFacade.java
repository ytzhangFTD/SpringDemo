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
 *  类CaseLoadFacade的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:53
 * </pre>
 */
public interface CaseLoadFacade {
    void saveCase(List<LegalCase> cases);

    void saveCaseOther(List<LegalCaseOther> caseOthers);
}
