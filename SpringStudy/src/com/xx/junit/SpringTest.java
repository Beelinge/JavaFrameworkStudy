package com.xx.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xx.DAO.UserDao;
import com.xx.DAO.UserDaoImpl;
import com.xx.pojo.Dog;
import com.xx.pojo.Person;


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
		application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dog dog = (Dog)application.getBean(Dog.class);
		System.out.println(dog.getName());
	}
	
	@Test
	public void test3() {
		application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person)application.getBean(Person.class);
		System.out.println(p.getName());
		System.out.println(p.getDog().getName());
	}
	
	@Test
	public void test4() {
		application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person)application.getBean("person2", Person.class);
		System.out.println(p.getName());
	}
}
