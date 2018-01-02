package com.xx.junit;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.mapper.UserMapper;
import com.xx.pojo.User;

public class UserMapperTest {
	private ApplicationContext context;
	
	@Before
	public void setup() throws Exception {
		this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
	}
	
	@Test
	public void testQueryUserById() {
		UserMapper bean = this.context.getBean(UserMapper.class);
		
		User user = bean.queryUserById(1);
		System.out.println(user);
	}
}
