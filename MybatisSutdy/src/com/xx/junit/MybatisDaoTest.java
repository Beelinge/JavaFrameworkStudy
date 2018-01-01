package com.xx.junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xx.DAO.UserDaoImpl;
import com.xx.pojo.User;

public class MybatisDaoTest {

	@Test
	public void testQueryUserById() throws Exception {
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(input);
		UserDaoImpl ui = new UserDaoImpl(sqlSessionFactory);
		User user = ui.queryUserById(28);
		System.out.println(user);
	}
}
