package com.ytzhang.test.batchload;


import java.util.List;

import com.ytzhang.test.batchload.model.LegalCase;
import com.ytzhang.test.batchload.model.LegalCaseOther;

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
