package com.ytzhang.test.batchload;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:28
 * </pre>
 */
public class Client {
    private static ApplicationContext context;

    private static CaseLoadFacade caseLoadFacadeImpl;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext(new String[] {"classpath:application-test.xml"});
        caseLoadFacadeImpl = (CaseLoadFacade)context.getBean("caseLoadFacadeImpl");
    }

    @Test
    public void test1() {
        LassenLoader caseLoader = new CaseLoader();
        List list = new ArrayList<LegalCase>();
        LegalCase legalCase = new LegalCase();
        list.add(legalCase);
        caseLoader.save(legalCase);
        caseLoader.save(list);

        LassenLoader caseOtherLoader = new CaseOtherLoader();
        List list2 = new ArrayList<LegalCaseOther>();
        LegalCaseOther legalCaseOther = new LegalCaseOther();
        list2.add(legalCaseOther);
        caseOtherLoader.save(legalCaseOther);
        caseOtherLoader.save(list2);

        caseLoadFacadeImpl.saveCase(list);
        caseLoadFacadeImpl.saveCaseOther(list2);
    }

    @Test
    public void test2() {
        System.out.println("success!");
    }
}
