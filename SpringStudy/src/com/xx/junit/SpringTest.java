package com.xx.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.DAO.UserDao;
import com.xx.DAO.UserDaoImpl;


public class SpringTest {

	private ApplicationContext application;

	@Test
	public void test1() {
		application = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) application.getBean(UserDao.class);
		userDao.sayHello();
//		UserDaoImpl impl = application.getBean(UserDaoImpl.class);
//		impl.sayHello();
	}
	
	@Test
	public void test2() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.sayHello();
	}
}
