package com.ytzhang.test.copytest;


import com.alibaba.fastjson.JSON;

/**
 * <pre>
 *  类Client的实现描述：TODO 类实现描述
 *  @author wb-zhangyitong  2017/7/17 10:07
 * </pre>
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Model model1 = new Model();
        model1.setName("model1");
        model1.setType("test");
        ModelNode node = new ModelNode();
        node.setName("modelNode");
        node.setAge("a11");
        model1.setNode(node);
        String jsonString = JSON.toJSONString(model1);
        Model parseObject = JSON.parseObject(jsonString, Model.class);
        boolean b = model1.getNode() == parseObject.getNode();
        Model clone = (Model)model1.clone();
        boolean b1 = clone.getNode() == model1.getNode();
        System.out.println(b);
        System.out.println(b1);
    }
}
