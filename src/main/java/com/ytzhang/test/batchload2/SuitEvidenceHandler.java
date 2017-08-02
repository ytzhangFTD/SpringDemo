package com.ytzhang.test.batchload2;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import com.ytzhang.test.batchload2.loader.Loader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * <pre>
 *  类SuitEvidenceHandler的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/2 9:20
 * </pre>
 */
public class SuitEvidenceHandler extends AbstractHandler {

    private Loader suitEvidenceLoader;

    public void setSuitEvidenceLoader(Loader suitEvidenceLoader) {
        this.suitEvidenceLoader = suitEvidenceLoader;
    }

    @Override
    public void handle(Request request) {
        bizHandler(request);
    }

    @Override
    public void bizHandler(Request request) {
        System.out.println("SuitEvidenceHandler bizHandler");
        String path = "";
        Resource resource = new FileSystemResource(path);
        suitEvidenceLoader.load(resource);
    }

}
