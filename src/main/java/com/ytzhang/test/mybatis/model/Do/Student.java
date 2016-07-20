package com.ytzhang.test.mybatis.model.Do;

/**
 * 类TestUser的实现描述：TODO 类实现描述 wb-zhangyitong 2016/7/20 10:22
 */
public class Student {

    private int id;

    public Student(String name){
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
