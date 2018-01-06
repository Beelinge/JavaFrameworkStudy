package com.xx.pojo;

public class User {
	private String Name;
	private Integer age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [Name=" + Name + ", age=" + age + "]";
	}
	
	
}
