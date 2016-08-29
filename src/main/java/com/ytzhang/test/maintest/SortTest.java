package com.ytzhang.test.maintest;

/*
 * Copyright 2016 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.istack.internal.NotNull;

/**
 * <pre>
 *  类SortTest的实现描述：
 *  sort 集合排序 通过实现Comparable或Comparator接口来实现排序功能
 *  compare（o1,o2） return 0 表示相等; >0表示 o1>o2; <0 表示 o1<o2;
 *  wb-zhangyitong  2016/8/29 14:11
 * </pre>
 */

public class SortTest {

    public static void main(String[] args) {
        // String reg = "^/account/lassenSSORpc/(trialStart|aaa).json[p]?$";
        // Pattern pattern = Pattern.compile(reg.toLowerCase());
        // String a = "/account/lassenSSORpc/trialStart.jsona";
        // System.out.println(pattern.matcher(a.toLowerCase()).matches());
        List<test1> test = new ArrayList<test1>();
        test1 t1 = new test1();
        t1.name = "aa";
        t1.order = 5;
        test.add(t1);
        test1 t2 = new test1();
        t2.name = "bb";
        t2.order = 4;
        test.add(t2);
        test1 t3 = new test1();
        t3.name = "cc";
        t3.order = 3;
        test1 t4 = new test1();
        t4.name = "dd";
        t4.order = 2;
        test1 t5 = new test1();
        t5.name = "ee";
        t5.order = 1;
        test1 t6 = new test1();
        t6.name = "ff";
        t6.order = 0;
        test.add(t3);
        test.add(t4);
        test.add(t5);
        test.add(t6);
        // 第一种排序器使用
        Collections.sort(test);
        // 第二种排序器使用
        Collections.sort(test, new TestComparator());
        System.out.println(test);

    }

    static class test1 implements Comparable<test1> {

        public test1(){
        }

        private String  name;
        private Integer order;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        @Override
        public int compareTo(@NotNull test1 o) {
            if (this.order > o.order) {
                return 1;
            } else if (this.order < o.order) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    static class TestComparator implements Comparator<test1> {

        @Override
        public int compare(test1 o1, test1 o2) {
            if (o1 == null || o2 == null) {
                return 0;
            }
            if (o1.order > o2.order) {
                return 1;
            } else if (o1.order < o2.order) {
                return -1;
            }
            return 0;
        }
    }
}
