package com.ytzhang.test.builder.abstractfactory;

/*
 * Copyright 2016 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */

import org.apache.commons.lang.StringUtils;

/**
 * <pre>
 *  类BulletFactory的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2016/8/25 15:36
 * </pre>
 */
public class BulletFactory implements AbstractFactory {

    public Gun getGun(String gunType) {
        return null;
    }

    public Bullet getBullet(String bulletType) {
        if (StringUtils.isBlank(bulletType)) {
            return null;
        }
        if (bulletType.equals("AK")) {
            return new AKBullet();
        }
        return null;
    }
}
