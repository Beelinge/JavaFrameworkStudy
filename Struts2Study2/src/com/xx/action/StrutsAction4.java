package com.xx.action;

import com.opensymphony.xwork2.ActionSupport;

/* 性性驱动方式一：提供属性的set方法的方式
 * 不够简洁，不推荐
 */
public class StrutsAction4 extends ActionSupport {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		System.out.println(age);
		return NONE;
	}
}
