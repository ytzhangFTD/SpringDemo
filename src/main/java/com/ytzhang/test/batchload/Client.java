package com.ytzhang.test.batchload;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.ytzhang.test.batchload.loader.CaseLoader;
import com.ytzhang.test.batchload.loader.LassenLoader;
import com.ytzhang.test.batchload.model.LegalCase;
import com.ytzhang.test.batchload.model.LegalCaseOther;
import com.ytzhang.test.batchload.model.SuitEvidence;
import com.ytzhang.test.batchload.reader.EvidenceZipFileReader;
import com.ytzhang.test.batchload.reader.LassenReader;
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

        List list2 = new ArrayList<LegalCaseOther>();
        LegalCaseOther legalCaseOther = new LegalCaseOther();
        list2.add(legalCaseOther);

        caseLoadFacadeImpl.saveCase(list);
        caseLoadFacadeImpl.saveCaseOther(list2);
    }

    @Test
    public void test() {
        LassenReader caseReader = new EvidenceZipFileReader();
        String path = "C:\\Users\\wb-zhangyitong\\Desktop\\test\\test.zip";
        InputStream in = null;
        try {
            in = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<SuitEvidence> read = caseReader.read(in);
        for (SuitEvidence evidence : read) {
            System.out.println(evidence);
        }
    }

}
