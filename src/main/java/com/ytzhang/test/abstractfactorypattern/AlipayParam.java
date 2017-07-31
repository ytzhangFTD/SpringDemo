package com.ytzhang.test.abstractfactorypattern;


import com.ytzhang.test.abstractfactorypattern.interceptor.AliPayRequestParam;

/**
 * <pre>
 *  类AlipayParam的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/12 16:03
 * </pre>
 */
public class AlipayParam {
    @AliPayRequestParam("myService")
    private String service;
    private String _input_charset;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String get_input_charset() {
        return _input_charset;
    }

    public void set_input_charset(String _input_charset) {
        this._input_charset = _input_charset;
    }
}
