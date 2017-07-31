package com.ytzhang.test.observerpattern;


/**
 * <pre>
 *  类Client的实现描述：
 *  @author wb-zhangyitong  2017/7/4 15:31
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Stock stock = new Stock("梦想", 10);
        Investor tom = new Investor("tom");
        stock.attach(tom);
        stock.update(20L);
        Investor jack = new Investor("jack");
        stock.attach(jack);
        stock.update(400L);
        stock.detach(jack);
        stock.update(5L);
    }
}
