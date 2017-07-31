package com.ytzhang.test.bridge;


/**
 * <pre>
 *  类Abstraction的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/10 9:45
 * </pre>
 */
public abstract class Abstraction implements Implementor {

    protected Implementor implementor;

    private String system;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSystem() {
        return system;
    }

    public abstract void display();
}
