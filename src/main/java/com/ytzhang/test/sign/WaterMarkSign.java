package com.ytzhang.test.sign;


/**
 * <pre>
 *  类WaterMarkSign的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 16:01
 * </pre>
 */
public class WaterMarkSign implements Sign {
    @Override
    public SignResult sign(SignRequest signRequest) {
        if (signRequest == null) {
            return new SignResult(false);
        }
        SignConfig config = signRequest.getSignConfig();
        if (!config.getClass().equals(WaterMarkConfig.class)) {
            return new SignResult(false);
        }
        WaterMarkConfig waterMarkConfig = (WaterMarkConfig)config;
        SignResult result = new SignResult();
        result.setSuccess(true);
        result.setType(waterMarkConfig.getType());
        result.setUrl(waterMarkConfig.getUrl());
        result.setSignRequest(signRequest);
        return result;
    }
}
