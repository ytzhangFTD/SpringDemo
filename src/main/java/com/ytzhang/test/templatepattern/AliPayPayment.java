package com.ytzhang.test.templatepattern;


/**
 * <pre>
 *  类AliPayPayment的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/5 16:26
 * </pre>
 */
public class AliPayPayment extends AbstractPayment {
    public AliPayPayment(String name) {
        super(name);
    }

    @Override
    public boolean bizValid(PaymentRequest request) {
        return true;
    }

    @Override
    public void bizHandler(PaymentResult result) {
        System.out.println(this.getName() + " bizHandler " + result);
    }
}
