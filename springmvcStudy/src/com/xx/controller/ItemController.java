package com.xx.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xx.pojo.Item;

@Controller
public class ItemController {
	@RequestMapping("/itemList.action")
	public ModelAndView queryItemList() {
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "1华为 荣耀8", 2399, new Date(), "质量好！11"));

		
		// 创建ModelAndView，用来存放数据和视图
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList", list);
		
//		modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		// 视图解析器根据前缀+逻辑视图名+后缀拼接出来物理路径
		modelAndView.setViewName("itemList");

		return modelAndView;

	}
}
