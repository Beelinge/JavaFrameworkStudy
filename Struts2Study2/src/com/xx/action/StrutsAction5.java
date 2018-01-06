package com.xx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xx.pojo.User;

public class StrutsAction5 extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return NONE;
	}
}

