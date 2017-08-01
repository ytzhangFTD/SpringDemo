package com.ytzhang.test.batchload.reader;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.ytzhang.test.batchload.model.SuitEvidence;

/**
 * <pre>
 *  类EvidenceZipFileReader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/1 11:07
 * </pre>
 */
public class EvidenceZipFileReader implements LassenReader<SuitEvidence> {
    @Override
    public List<SuitEvidence> read(InputStream inputStream) {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry zipEntry = null;
        List<SuitEvidence> evidences = new ArrayList<SuitEvidence>();
        try {
            while ((zipEntry = zipInputStream.getNextEntry()) != null && !zipEntry.isDirectory()) {
                SuitEvidence evidence = new SuitEvidence();
                evidence.setName(zipEntry.getName());
                evidences.add(evidence);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return evidences;
    }
}
