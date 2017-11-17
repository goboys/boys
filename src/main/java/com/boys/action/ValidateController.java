package com.boys.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 项目名称：boys   
 * 类名称：ValidateController   
 * 类描述：   
 * 创建人：boys  
 * 创建时间：2017年11月17日 下午4:31:42
 */
@Controller
@RequestMapping("/validate")
public class ValidateController {

	@RequestMapping("/test")
	public String test(HttpServletRequest request,HttpServletResponse response){
		
		return "validate/validate";
	}
	
	
	
	
	
}
