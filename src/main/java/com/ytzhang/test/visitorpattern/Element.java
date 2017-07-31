package com.ytzhang.test.visitorpattern;


/**
 * <pre>
 *  类Element的实现描述：
 *  抽象被访问元素
 *  @author wb-zhangyitong  2017/7/6 16:24
 * </pre>
 */
public abstract class Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
