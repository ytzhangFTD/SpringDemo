package com.ytzhang.test.bridge;


/**
 * <pre>
 *  类RefinedAbstraction的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/10 9:46
 * </pre>
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void display() {
        if ("windows".equals(this.getSystem())) {
            System.out.println("windows display");
        } else if ("linux".equals(this.getSystem())) {
            System.out.println("linux display");
        } else if ("mac".equals(this.getSystem())) {
            System.out.println("mac display");
        }
    }

    public void operation() {
        implementor.operation();
    }
}
