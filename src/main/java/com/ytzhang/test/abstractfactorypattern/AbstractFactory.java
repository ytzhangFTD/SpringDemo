package com.ytzhang.test.abstractfactorypattern;

/**
 * <pre>
 *  类AbstractFactory的实现描述：
 *  抽象factory类
 *  @author wb-zhangyitong  2017/7/7 10:05
 * </pre>
 */
public abstract class AbstractFactory {
    public abstract AbstractProduct createProductA();

    public abstract AbstractProduct createProductB();

    public abstract AbstractProduct createProductC();
}
