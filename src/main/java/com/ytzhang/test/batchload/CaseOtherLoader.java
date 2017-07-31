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
 *  类CaseOtherLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:48
 * </pre>
 */
public class CaseOtherLoader extends AbstractLassenLoader<LegalCaseOther> {
    @Override
    public void save(List<LegalCaseOther> collection) {
        System.out.println("save caseOther collection");
    }

    @Override
    public void save(LegalCaseOther data) {
        System.out.println("save caseOther");
    }

}
