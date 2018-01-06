package com.xx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xx.pojo.User;

// 方式三：模型驱动
public class StrutsAction6 extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return NONE;
	}
}
