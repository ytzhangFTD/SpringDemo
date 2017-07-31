package com.ytzhang.test.strategypattern;


/**
 * <pre>
 *  类Context的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 14:31
 * </pre>
 */
public class Context {
    private AbstractStrategy strategy;

    public AbstractStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }
}
