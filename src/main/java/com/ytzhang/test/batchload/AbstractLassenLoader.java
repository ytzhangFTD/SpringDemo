package com.ytzhang.test.batchload;


import java.util.List;

import org.springframework.core.io.Resource;

/**
 * <pre>
 *  类AbstractLassenLoader的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/31 14:35
 * </pre>
 */
public abstract class AbstractLassenLoader<T> implements LassenLoader<T> {
    @Override
    public Resource load(String path) {
        return null;
    }

    @Override
    public List<T> analyze(Resource resource) {
        return null;
    }

    @Override
    public void save(List<T> collection) {

    }

    @Override
    public void save(T data) {

    }
}
