package com.ytzhang.test.abstractfactorypattern;


/**
 * <pre>
 *  类AlipayTradeExtParam的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/12 16:12
 * </pre>
 */
public class AlipayTradeExtParam extends AlipayExtParam {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
