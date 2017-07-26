package com.ytzhang.test.abstractfactorypattern;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ytzhang.test.abstractfactorypattern.interceptor.AliPayRequestParam;
import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  类AlipayExtParam的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/12 16:03
 * </pre>
 */
public class AlipayExtParam extends AlipayParam {

    private String myExt;

    public String getMyExt() {
        return myExt;
    }

    public void setMyExt(String myExt) {
        this.myExt = myExt;
    }

    public Map<String, String> getParamMap() {
        List<Field> fields = new ArrayList<Field>();
        Class<?> currentClass = this.getClass();
        while (currentClass != null) {
            fields.addAll(Arrays.asList(currentClass.getDeclaredFields()));
            currentClass = currentClass.getSuperclass();
        }

        Map<String, String> result = new HashMap<String, String>();
        for (Field field : fields) {
            String name = field.getName();
            AliPayRequestParam annotation = field.getAnnotation(AliPayRequestParam.class);
            if (annotation == null) {
                continue;
            }
            String key = annotation.value();
            if (StringUtils.isBlank(key)) {
                continue;
            }
            String valueByName = getValueByName(name, this);
            if (valueByName != null) {
                result.put(key, valueByName);
            }
        }
        return result;
    }

    private String getValueByName(String name, Object o) {
        if (name == null || name.length() < 0) {
            return null;

        }
        String firstUp = name.substring(0, 1).toUpperCase();
        String getter = "get" + firstUp + name.substring(1);
        try {
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
