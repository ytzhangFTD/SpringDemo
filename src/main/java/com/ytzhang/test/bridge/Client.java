package com.ytzhang.test.bridge;


/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/10 9:55
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Abstraction action = new RefinedAbstraction();
        Implementor implementor = new ImplementorB();
        action.setImplementor(implementor);
        action.setSystem("linux");
        action.operation();
        action.display();
    }
}
