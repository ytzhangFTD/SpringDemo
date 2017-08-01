package com.ytzhang.test.batchload.loader;

import java.io.IOException;
import java.util.List;

import com.ytzhang.test.batchload.model.LegalCase;
import com.ytzhang.test.batchload.model.Result;
import com.ytzhang.test.batchload.reader.LassenReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

/**
 * <pre>
 *  类CaseLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:45
 * </pre>
 */
public class CaseLoader extends AbstractLassenLoader<LegalCase> {
    @Autowired
    private LassenReader lassenReader;

    @Override
    public List<LegalCase> analyze(Resource resource) {
        if (resource.exists()) {
            try {
                return lassenReader.read(resource.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.analyze(resource);
    }

    @Override
    public void save(List<LegalCase> collection) {
        super.save(collection);
        System.out.println("save legalcase collection");
    }

    @Override
    public void save(LegalCase data) {
        System.out.println("save legalcase");
    }

    @Override
    public Result handle(Resource resource) {
        if (false) {
            return null;
        } else {
            return this.loader.handle(resource);
        }
    }
}
