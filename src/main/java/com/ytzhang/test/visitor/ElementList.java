package com.ytzhang.test.visitor;
/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  类ElementList的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/8/3 15:46
 * </pre>
 */
public class ElementList {
    private List<Element> elementList = new ArrayList<Element>();

    void add(Element element) {
        elementList.add(element);
    }

    void accept(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }
}
