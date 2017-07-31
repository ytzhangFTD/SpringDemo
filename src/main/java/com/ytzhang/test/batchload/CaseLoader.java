package com.ytzhang.test.batchload;


import java.util.List;

/**
 * <pre>
 *  类CaseLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:45
 * </pre>
 */
public class CaseLoader extends AbstractLassenLoader<LegalCase> {
    @Override
    public void save(List<LegalCase> collection) {
        super.save(collection);
        System.out.println("save legalcase collection");
    }

    @Override
    public void save(LegalCase data) {
        System.out.println("save legalcase");
    }
}
