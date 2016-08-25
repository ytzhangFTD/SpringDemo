package com.ytzhang.test.maintest;

import com.ytzhang.test.mybatis.Do.User;
import com.ytzhang.test.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2016/6/22.
 */
public class MybatisTest {


	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";

		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Properties prop= PropertiesLoaderUtils.loadAllProperties("dbconfig.properties");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,prop);

		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			User user = mapper.selectByPrimaryKey(1L);
			System.out.println(user.getName());
		} finally {
			session.close();
		}
	}
}
