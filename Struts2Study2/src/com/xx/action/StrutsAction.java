package com.xx.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//方式一：通过ActionContext类访问

public class StrutsAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		ActionContext context = ActionContext.getContext();
		Map<String, Object> parameters = context.getParameters();
		for (String key : parameters.keySet()) {
			String[] value = (String[])parameters.get(key);	
			System.out.println(key+" "+value[0]);
			context.put(key, value[0]);
			}
		
		context.put("requestName", "Beelin");
		context.put("jj", "Beelin");
		context.getSession().put("sessionName", "为人叔公");
		context.getApplication().put("applicationName", "老鸽");
		return SUCCESS;
	}
}
