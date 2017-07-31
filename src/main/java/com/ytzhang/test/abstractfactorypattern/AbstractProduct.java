package com.ytzhang.test.abstractfactorypattern;


/**
 * <pre>
 *  类AbstractProduct的实现描述：
 *  抽象产品类
 *  @author wb-zhangyitong  2017/7/7 10:06
 * </pre>
 */
public abstract class AbstractProduct {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
