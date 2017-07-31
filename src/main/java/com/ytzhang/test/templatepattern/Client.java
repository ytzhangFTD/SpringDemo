package com.ytzhang.test.templatepattern;


import java.util.HashMap;

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 16:28
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        AliPayPayment payment = new AliPayPayment("alipay");
        payment.setValid(false);
        PaymentRequest request = new PaymentRequest();
        request.setParams(new HashMap<String, String>());
        payment.execute(request);
    }
}
