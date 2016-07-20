package com.ytzhang.test.Bo;

import com.ytzhang.test.mybatis.model.Do.Student;
import com.ytzhang.test.mybatis.model.Do.Teacher;

/**
 * 类UserBo的实现描述：TODO 类实现描述 wb-zhangyitong 2016/7/20 10:23
 */
public interface StudentBo {

    /**
     * 新增用户
     *
     * @param user
     */
    public void addUser(Student user);

    public void addUser2(Student student);

    public void addTeacher(Teacher teacher);
}
