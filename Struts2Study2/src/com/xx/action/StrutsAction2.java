package com.xx.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

//方式二：通过特定接口访问
public class StrutsAction2 extends ActionSupport implements ServletRequestAware{
	HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
		
	}
	@Override
	public String execute() throws Exception {
		request.setAttribute("message", "通过ServletRequestAware接口实现了访问Servlet API");
		return SUCCESS;
	}
}
