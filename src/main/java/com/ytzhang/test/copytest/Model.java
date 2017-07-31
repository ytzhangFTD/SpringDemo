package com.ytzhang.test.copytest;


/**
 * <pre>
 *  类Model的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/17 10:06
 * </pre>
 */
public class Model implements Cloneable{
    private String name;
    private String type;
    private ModelNode node;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModelNode getNode() {
        return node;
    }

    public void setNode(ModelNode node) {
        this.node = node;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
