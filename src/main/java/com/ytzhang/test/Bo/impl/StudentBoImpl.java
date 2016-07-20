package com.ytzhang.test.Bo.impl;

import com.ytzhang.test.Bo.StudentBo;
import com.ytzhang.test.Bo.TeacherBo;
import com.ytzhang.test.mybatis.model.Do.Teacher;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ytzhang.test.mybatis.model.Do.Student;

/**
 * Administrator 2016/7/20
 */
public class StudentBoImpl extends JdbcDaoSupport implements StudentBo {

	private TeacherBo teacherBoImpl;

	public void setTeacherBoImpl(TeacherBo teacherBoImpl) {
		this.teacherBoImpl = teacherBoImpl;
	}

	@Transactional(propagation = Propagation.REQUIRED)
    public void addUser(Student user) {
        String sql = "insert into user(name) values(?)";
        this.getJdbcTemplate().update(sql, user.getName());
//        throw new RuntimeException();
		Teacher teacher=new Teacher();
		teacher.setName("teacher1");
		teacherBoImpl.addTeacher(teacher);
    }
}
