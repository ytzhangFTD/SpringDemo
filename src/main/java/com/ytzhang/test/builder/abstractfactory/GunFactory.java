package com.ytzhang.test.builder.abstractfactory;
/*
 * Copyright 2016 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */


import org.apache.commons.lang.StringUtils;

/**
 * <pre>
 *  类GunFactory的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2016/8/25 15:09
 * </pre>
 */
public class GunFactory implements AbstractFactory{
	public Gun getGun(String gunType){
		if (StringUtils.isBlank(gunType)){
			return null;
		}
		if (gunType.equals("AK")){
			return new AkGun();
		}
		return null;
	}

	public Bullet getBullet(String bulletType) {
		return null;
	}

}
