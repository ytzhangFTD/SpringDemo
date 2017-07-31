package com.ytzhang.test.batchload;


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
