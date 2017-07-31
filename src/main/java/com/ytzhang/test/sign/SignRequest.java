package com.ytzhang.test.sign;


/**
 * <pre>
 *  类SignRequest的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/13 16:32
 * </pre>
 */
public class SignRequest {
    private String fileType;
    private String fileUrl;
    private SignConfig signConfig;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public SignConfig getSignConfig() {
        return signConfig;
    }

    public void setSignConfig(SignConfig signConfig) {
        this.signConfig = signConfig;
    }
}
