package com.boys.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 *    
 * 项目名称：boys   
 * 类名称：UserController   
 * 类描述： spring MVC 通过一个@Controller注解即可将一个POJO转化为处理请求的控制器，通过RequestMapping为控制器指定处理
 * 哪些URL的请求。
 * 
 *   
 * 创建人：boys  
 * 创建时间：2017年6月17日 下午3:56:04        
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/test")
	public String test(String test){
		
		System.out.println("test="+test);
		
		return "user/test";
	}
}
