package com.xx.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspectAnnotation {
	@Pointcut("execution(* com.xx.service.impl.UserServiceImpl.*(..))")
	
	public void pc() {};
	
		//前置通知
	@Before("MyAspectAnnotation.pc()")
	public void before(){
		System.out.println("这是前置通知!!");
	}
	
	//后置通知
	@AfterReturning("MyAspectAnnotation.pc()")
	public void afterReturning(){
		System.out.println("这是后置通知(如果出现异常不会调用)!!");
	}
	
	//环绕通知
	@Around("MyAspectAnnotation.pc()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知之前的部分!!");
		Object proceed = pjp.proceed();//调用目标方法
		System.out.println("这是环绕通知之后的部分!!");
		return proceed;
	}
	
	//异常通知
	@After("MyAspectAnnotation.pc()")
	public void afterException(){
		System.out.println("出事啦!出现异常了!!");
	}
	
	//后置通知
	@After("MyAspectAnnotation.pc()")
	public void after(){
		System.out.println("这是后置通知(出现异常也会调用)!!");
	}
}
