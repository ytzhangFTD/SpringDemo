package com.ytzhang.test.Bo.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ytzhang.test.Bo.StudentBo;
import com.ytzhang.test.Bo.TeacherBo;
import com.ytzhang.test.mybatis.model.Do.Student;
import com.ytzhang.test.mybatis.model.Do.Teacher;

/**
 * Administrator 2016/7/20
 */
public class StudentBoImpl extends JdbcDaoSupport implements StudentBo {

    private TeacherBo teacherBoImpl;

    public void setTeacherBoImpl(TeacherBo teacherBoImpl) {
        this.teacherBoImpl = teacherBoImpl;
    }

    /**
     * 在一个方法里调用另一个类的包含事务的方法，两个方法事务传播特性都为REQUIRED
     * 
     * @param user
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser(Student user) {
        String sql = "insert into user(name) values(?)";
        this.getJdbcTemplate().update(sql, user.getName());
        // throw new RuntimeException();
        try {
            Teacher teacher = new Teacher("teacher1");
            teacherBoImpl.addTeacher(teacher);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    /**
     * 在一个方法里调用该类另一个的包含事务的方法，两个方法事务传播特性都为REQUIRED
     *
     * @param student
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser2(Student student) {
        String sql = "insert into user(name) values(?)";
        this.getJdbcTemplate().update(sql, student.getName());
        try {
            Teacher teacher = new Teacher("teacher2");
            this.addTeacher2(teacher);
        } catch (Exception e) {
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addTeacher2(Teacher teacher) {
        String sql = "insert into teacher(name) values(?)";
        this.getJdbcTemplate().update(sql, teacher.getName());
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
//    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser3(Student student) {
        String sql = "insert into user(name) values(?)";
        this.getJdbcTemplate().update(sql, student.getName());
        try {
            Teacher teacher = new Teacher("teacher3");
            teacherBoImpl.addTeacher2(teacher);
        } catch (Exception e) {
        }
    }

	@Transactional(propagation = Propagation.MANDATORY)
	public void addUser4(Student student) {

	}

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addUser5(Student student) {

    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addUser6(Student student) {

    }

    @Transactional(propagation = Propagation.NEVER)
    public void addUser7(Student student) {

    }

    @Transactional(propagation = Propagation.NESTED)
    public void addUser8(Student student) {
		String sql = "insert into user(name) values(?)";
		this.getJdbcTemplate().update(sql, student.getName());
		try {
			Teacher teacher = new Teacher("teacher7");
			teacherBoImpl.addTeacher7(teacher);
		} catch (Exception e) {
		}
//		throw new RuntimeException();
	}

}
