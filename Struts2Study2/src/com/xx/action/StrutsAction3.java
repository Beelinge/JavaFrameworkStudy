package com.xx.action;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

//方式3：通过ServletActionContext访问
public class StrutsAction3 extends ActionSupport {
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			String[] value = map.get(key);
			System.out.println(key+ " " + Arrays.toString(value));
		}
		
		//向request域中存值
		request.setAttribute("requestName", "1");
		//向session域中存值
		request.getSession().setAttribute("sessionName", "2");
		//向application域中存值
		ServletActionContext.getServletContext().setAttribute("applicationName", "3");
		return SUCCESS;
	}
}
