package com.ytzhang.test.visitorpattern;


/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/6 16:30
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        ElementList list = new ElementList();
        list.addElement(new FirstElement());
        list.addElement(new SecondElement());
        VisitorA visitorA = new VisitorA();

        for (Element e : list.getElements()) {
            e.accept(visitorA);
        }

    }
}
