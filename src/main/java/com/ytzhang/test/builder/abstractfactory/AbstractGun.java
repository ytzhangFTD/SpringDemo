package com.ytzhang.test.builder.abstractfactory;

/*
 * Copyright 2016 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */

/**
 * <pre>
 *  类AbstractGun的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2016/8/25 15:07
 * </pre>
 */
public abstract class AbstractGun implements Gun {

    private String name;
    private AbstractBullet bullet;

    public AbstractGun(String name, AbstractBullet bullet){
        this.name = name;
        this.bullet = bullet;
    }

    public AbstractGun(String name){
        this.name = name;
    }

    public AbstractGun(){
    }

    public String getName() {
        return name;
    }

    public AbstractBullet getBullet() {
        return bullet;
    }
}
