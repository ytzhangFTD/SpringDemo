package com.ytzhang.test.strategypattern;


/**
 * <pre>
 *  类AlipayStrategy的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 14:58
 * </pre>
 */
public class AlipayStrategy extends AbstractStrategy {
    private String name;

    public AlipayStrategy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("执行 " + this.name + " 策略");
    }
}
