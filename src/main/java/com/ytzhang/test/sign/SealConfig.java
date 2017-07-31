package com.ytzhang.test.sign;


/**
 * <pre>
 *  类SealConfig的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 15:59
 * </pre>
 */
public class SealConfig extends SignConfig {
    private String sealKey;
    private String sealSecret;

    public String getSealKey() {
        return sealKey;
    }

    public void setSealKey(String sealKey) {
        this.sealKey = sealKey;
    }

    public String getSealSecret() {
        return sealSecret;
    }

    public void setSealSecret(String sealSecret) {
        this.sealSecret = sealSecret;
    }
}
