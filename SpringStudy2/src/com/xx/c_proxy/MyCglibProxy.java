package com.xx.c_proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.xx.service.UserService;
import com.xx.service.impl.UserServiceImpl;

public class MyCglibProxy implements MethodInterceptor{

	public UserService createProxy() {
		//帮我们生成代理对象
		Enhancer en = new Enhancer();
		//设置对谁进行代理
		en.setSuperclass(UserServiceImpl.class);
		//代理要做什么
		en.setCallback(this);
		//创建代理对象
		UserService us = (UserService) en.create();
		return us;
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("权限校验前================");
		
		//调用原有方法
		Object object = arg3.invokeSuper(arg0, arg2);
		
		System.out.println("权限校验后================");
		return object;
	}

}
