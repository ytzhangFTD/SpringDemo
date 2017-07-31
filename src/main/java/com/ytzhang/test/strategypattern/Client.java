package com.ytzhang.test.strategypattern;


/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 14:30
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new SearchStrategy("search"));
        context.getStrategy().print();
        context.setStrategy(new AlipayStrategy("alipay"));
        context.getStrategy().print();

    }
}
