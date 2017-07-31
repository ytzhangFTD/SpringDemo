package com.ytzhang.test.sign;


/**
 * <pre>
 *  类SignResult的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 16:00
 * </pre>
 */
public class SignResult {
    private boolean success;
    private String type;
    private String url;
    private SignRequest signRequest;

    public SignResult() {
    }

    public SignResult(boolean success) {
        this.success = success;
    }

    public SignRequest getSignRequest() {
        return signRequest;
    }

    public void setSignRequest(SignRequest signRequest) {
        this.signRequest = signRequest;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
