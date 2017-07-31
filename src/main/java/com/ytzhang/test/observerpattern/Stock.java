package com.ytzhang.test.observerpattern;


/**
 * <pre>
 *  类Stock的实现描述：
 *  股票
 *  @author wb-zhangyitong  2017/7/4 15:34
 * </pre>
 */
public class Stock extends Subject {
    private String name;

    private long price;

    public void update(Long p) {
        double l = Math.abs(p - price) /new Double(price);
        System.out.println(this.getName() + "价格变动，" + price + "-->" + p);
        this.price = p;
        if (l > 0.05) {
            for (Observer observer : this.getObservers()) {
                observer.update();
            }
        }
    }

    public Stock(String name, long price) {
        this.name = name;
        this.price = price;
        System.out.println(name + "股票初始化:原始价位" + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
