package com.ytzhang.test.batchload.model;

import java.util.List;

/**
 * <pre>
 *  类LegalCaseOther的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:32
 * </pre>
 */
public class LegalCaseOther {
    private List<SuitEntity> suitEntities;
    private List<SuitRequest> suitRequests;
    private List<SuitEvidence> suitEvidences;

    public List<SuitEntity> getSuitEntities() {
        return suitEntities;
    }

    public void setSuitEntities(List<SuitEntity> suitEntities) {
        this.suitEntities = suitEntities;
    }

    public List<SuitRequest> getSuitRequests() {
        return suitRequests;
    }

    public void setSuitRequests(List<SuitRequest> suitRequests) {
        this.suitRequests = suitRequests;
    }

    public List<SuitEvidence> getSuitEvidences() {
        return suitEvidences;
    }

    public void setSuitEvidences(List<SuitEvidence> suitEvidences) {
        this.suitEvidences = suitEvidences;
    }
}
