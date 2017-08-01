package com.ytzhang.test.batchload.reader;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.io.InputStream;
import java.util.List;

import com.ytzhang.test.batchload.model.LegalCase;

/**
 * <pre>
 *  类CaseXmlReader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/1 9:49
 * </pre>
 */
public class CaseXmlReader implements LassenReader<LegalCase> {
    @Override
    public List<LegalCase> read(InputStream inputStream) {
        return null;
    }
}
