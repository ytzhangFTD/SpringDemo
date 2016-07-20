package com.ytzhang.test.mybatis.model.Do;

/**
 * 类TestTeacher的实现描述：TODO 类实现描述 wb-zhangyitong 2016/7/20 13:53
 */
public class Teacher {

    private int    id;
    private String name;

    public Teacher(String name){
        this.name = name;
    }

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
