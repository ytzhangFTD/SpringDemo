package com.ytzhang.test.sign;


/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 16:00
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        WaterMarkConfig config = new WaterMarkConfig();
        config.setUrl("waterConfigUrl");
        config.setType("waterMark");
        SignRequest signRequest = new SignRequest();
        signRequest.setSignConfig(config);
        Sign warterSign = new WaterMarkSign();
        SignResult signResult = warterSign.sign(signRequest);
        if (signResult.isSuccess()) {

        }
    }
}
