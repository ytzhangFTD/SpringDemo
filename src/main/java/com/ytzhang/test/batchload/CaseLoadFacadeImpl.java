package com.ytzhang.test.batchload;


import java.util.List;

import com.ytzhang.test.batchload.loader.AbstractLassenLoader;
import com.ytzhang.test.batchload.model.LegalCase;
import com.ytzhang.test.batchload.model.LegalCaseOther;
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
