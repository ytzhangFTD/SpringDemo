package com.ytzhang.test.observerpattern;


/**
 * <pre>
 *  类Investor的实现描述：
 *  股民
 *  @author wb-zhangyitong  2017/7/4 15:33
 * </pre>
 */
public class Investor extends Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + "：赶紧看一看啊，股票有波动");
    }
}
