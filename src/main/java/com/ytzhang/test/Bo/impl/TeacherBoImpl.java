package com.ytzhang.test.Bo.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ytzhang.test.Bo.TeacherBo;
import com.ytzhang.test.mybatis.model.Do.Teacher;

/**
 * 类TeacherBoimpl的实现描述：TODO 类实现描述 wb-zhangyitong 2016/7/20 13:52
 */
public class TeacherBoImpl extends JdbcDaoSupport implements TeacherBo {

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTeacher(Teacher teacher) {
        String sql = "insert teacher(name)values(?)";
        this.getJdbcTemplate().update(sql, teacher.getName());
		throw new RuntimeException();
    }
}
