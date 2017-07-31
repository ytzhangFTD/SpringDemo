package com.ytzhang.test.abstractfactorypattern;


/**
 * <pre>
 *  类FirstFactory的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/7 10:09
 * </pre>
 */
public class FirstFactory extends AbstractFactory {
    @Override
    public AbstractProduct createProductA() {
        System.out.println("FirstFactory create ProductA ");
        return new ProductA();
    }

    @Override
    public AbstractProduct createProductB() {
        System.out.println("FirstFactory create ProductB ");
        return new ProductB();
    }

    @Override
    public AbstractProduct createProductC() {
        System.out.println("FirstFactory create ProductC ");
        return new ProductC();
    }
}
