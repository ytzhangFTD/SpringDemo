package com.ytzhang.test.visitorpattern;
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
 *  类ObjectStruct的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 16:27
 * </pre>
 */
public class ElementList {
    private List<Element> elements;

    public List<Element> getElements() {
        return elements;
    }

    public ElementList() {
        elements = new ArrayList<Element>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
