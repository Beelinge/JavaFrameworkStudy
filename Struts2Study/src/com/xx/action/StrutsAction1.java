package com.xx.action;

//方式1: 创建一个类.可以是POJO
//POJO:不用继承任何父类.也不需要实现任何接口.
//使struts2框架的代码侵入性更低.

public class StrutsAction1 {
	public String execute() {
		System.out.println("StrutsAction1中的execute执行了");
		return "success";
	}
	
	
}
