package com.ytzhang.test.mybatis.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_createtime
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private Date gmtCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creator
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_modifiedtime
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private Date gmtModifiedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modifier
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_createtime
     *
     * @return the value of user.gmt_createtime
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public Date getGmtCreatetime() {
        return gmtCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_createtime
     *
     * @param gmtCreatetime the value for user.gmt_createtime
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setGmtCreatetime(Date gmtCreatetime) {
        this.gmtCreatetime = gmtCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creator
     *
     * @return the value of user.creator
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creator
     *
     * @param creator the value for user.creator
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_modifiedtime
     *
     * @return the value of user.gmt_modifiedtime
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public Date getGmtModifiedtime() {
        return gmtModifiedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_modifiedtime
     *
     * @param gmtModifiedtime the value for user.gmt_modifiedtime
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setGmtModifiedtime(Date gmtModifiedtime) {
        this.gmtModifiedtime = gmtModifiedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modifier
     *
     * @return the value of user.modifier
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modifier
     *
     * @param modifier the value for user.modifier
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Wed Jun 22 22:52:29 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}