package com.ytzhang.test.abstractfactorypattern;


import java.util.Map;
import java.util.Map.Entry;

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/7 10:08
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        /*AbstractFactory factory = new FirstFactory();
        AbstractProduct productA = factory.createProductA();
        AbstractProduct productB = factory.createProductB();
        AbstractProduct productC = factory.createProductC();
        System.out.println(productA.getName());
        System.out.println(productB.getName());
        System.out.println(productC.getName());*/

        AlipayTradeExtParam alipayTradeExtParam = new AlipayTradeExtParam();
        alipayTradeExtParam.setPrice("11.0");
        alipayTradeExtParam.set_input_charset("utf-8");
        alipayTradeExtParam.setMyExt("扩展字段");
        alipayTradeExtParam.setService("service.trade.test");
        Map<String, String> paramMap = alipayTradeExtParam.getParamMap();
        for (Entry<String, String> entry : paramMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        AlipayParam param=alipayTradeExtParam;
        if (param.getClass().equals(AlipayTradeExtParam.class)){
            AlipayTradeExtParam extParam = (AlipayTradeExtParam)param;
            String price = extParam.getPrice();
        }
    }

    private static void handle(AlipayParam param){

    }
}
