package com.xx.controller;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ItemController {
	@RequestMapping("/upload.action")
	public ModelAndView queryItemList() {
		
		// 创建ModelAndView，用来存放数据和视图
		ModelAndView modelAndView = new ModelAndView();
		
		
//		modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		// 视图解析器根据前缀+逻辑视图名+后缀拼接出来物理路径
		modelAndView.setViewName("index");

		return modelAndView;

	}
	
	@RequestMapping("/commit.action")
	public ModelAndView commit( MultipartFile pictureFile) throws IllegalStateException, IOException {
		// 设置图片名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();
		// 获取文件名
		String oriName = pictureFile.getOriginalFilename();
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));

		// 开始上传
		pictureFile.transferTo(new File("/Users/Beelin/Desktop/upload/" + picName + extName));
		
		ModelAndView modelAndView = new ModelAndView();
		
		
//		modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		// 视图解析器根据前缀+逻辑视图名+后缀拼接出来物理路径
		modelAndView.setViewName("success");

		return modelAndView;
	}

}
