package com.ytzhang.test.Bo.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ytzhang.test.Bo.UserBo;
import com.ytzhang.test.mybatis.model.TestUser;

/**
 * Administrator 2016/7/20
 */
public class UserBoImpl extends JdbcDaoSupport implements UserBo {

    public void addUser(TestUser user) {
        String sql = "insert into user(name) values(?)";
        this.getJdbcTemplate().update(sql, user.getName());
    }
}
