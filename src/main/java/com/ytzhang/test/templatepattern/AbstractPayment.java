package com.ytzhang.test.templatepattern;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *  类AbstractPayment的实现描述：
 *  支付过程的抽象类
 *  @author wb-zhangyitong  2017/7/5 15:30
 * </pre>
 */
public abstract class AbstractPayment {
    private String name;

    private boolean isValid;

    private List<String> encodeKey;

    public AbstractPayment(String name) {
        this.name = name;
        this.isValid = true;
        this.encodeKey = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setEncodeKey(List<String> encodeKey) {
        this.encodeKey = encodeKey;
    }

    public PaymentResult execute(PaymentRequest request) {
        //1.biz校验
        if (!bizValid(request)) {
            return null;
        }
        //2.校验参数
        if (isValid) {
            valid(request);
        }
        //7.isEncode 特殊字段要encode
        Map<String, String> params = request.getParams();
        for (String key : params.keySet()) {
            if (needEncode(key)) {
                System.out.println(" encode " + key);
            }
        }
        //3.签名 sign
        sign(request);
        //6.构造请求url
        buildUrl(params);
        //8.发起支付请求（http）
        PaymentResult paymentResult = httpExecute(request);
        bizHandler(paymentResult);
        return paymentResult;
    }
    //4.校验参数回调正确性
    //5.返回值解析

    public boolean bizValid(PaymentRequest request) {
        System.out.println(this.getName() + " 业务校验" + request);
        return false;
    }

    public boolean valid(PaymentRequest request) {
        System.out.println(this.getName() + " 系统参数校验" + request);
        return true;
    }

    public void sign(PaymentRequest request) {
        System.out.println(this.getName() + " 签名----");
    }

    private void buildUrl(Map<String, String> map) {
        System.out.println(this.getName() + " buildUrl 构造url");
    }

    private boolean needEncode(String key) {
        if (encodeKey.contains(key)) {
            return true;
        } else {
            return false;
        }
    }

    private PaymentResult httpExecute(PaymentRequest request) {
        System.out.println(this.getName() + " 发起请求");
        return new PaymentResult();
    }

    public void bizHandler(PaymentResult result) {
        //    可以用来保存付款请求操作等
        System.out.println(this.getName() + " 业务操作" + result);
    }

}
