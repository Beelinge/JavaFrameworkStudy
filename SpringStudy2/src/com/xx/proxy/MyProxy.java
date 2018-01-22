package com.xx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.xx.service.UserService;

public class MyProxy implements InvocationHandler{
	private UserService userService;
	
	public MyProxy(UserService us) {
		this.userService = us;
	}
	
	public UserService createProxy() {
		UserService usProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), this);
		return usProxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("save".equals(method.getName())){ 
			System.out.println("权限校验================");
		}
		return method.invoke(userService, args);
	}
}
