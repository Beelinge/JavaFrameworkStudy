package com.xx.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xx.c_proxy.MyCglibProxy;
import com.xx.proxy.MyProxy;
import com.xx.service.UserService;
import com.xx.service.impl.UserServiceImpl;

//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:applicationContext.xml")

public class UserTest {
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void test1() {
		UserService us = new UserServiceImpl();
		MyProxy p = new MyProxy(us);
		UserService usProxy = p.createProxy();
		usProxy.save();
		
		//代理对象与被代理对象实现了相同的接口
		//代理对象 与 被代理对象没有继承关系
		System.out.println(usProxy instanceof UserServiceImpl );//false
	}
	
	@Test
	public void test2() {
		MyCglibProxy myCglibProxy = new MyCglibProxy();
		UserService usProxy = myCglibProxy.createProxy();
		usProxy.save();
		
	}
	
	@Test
	public void test3() {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService us = (UserService)context.getBean("userService");
		us.save();
	}
	
	@Test
	public void test4() {
		us.delete();
	}
}
