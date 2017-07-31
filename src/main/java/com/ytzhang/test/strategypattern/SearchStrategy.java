package com.ytzhang.test.strategypattern;


/**
 * <pre>
 *  类SearchStrategy的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 14:29
 * </pre>
 */
public class SearchStrategy extends AbstractStrategy {
    private String name;

    public SearchStrategy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("执行 " + this.name + " 策略");
    }
}
