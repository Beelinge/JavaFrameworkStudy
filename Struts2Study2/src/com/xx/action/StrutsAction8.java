package com.xx.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.xx.pojo.User;

public class StrutsAction8 extends ActionSupport{
	private Map<String, User> map;

	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}
	
	@Override
	public String execute() throws Exception {
		for (String key : map.keySet()) {
			User user = map.get(key);
			System.out.println(key+" "+user);
		}
		return NONE;
	}
}
