package com.boys.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boys.bean.User;
import com.boys.server.iface.IUserService;

/**
 * 
 *    
 * 项目名称：boys   
 * 类名称：UserController   
 * 类描述： spring MVC 通过一个@Controller注解即可将一个POJO转化为处理请求的控制器，通过RequestMapping为控制器指定处理
 * 哪些URL的请求。
 * RequestMapping不但支持标准的URL，还支持Ant风格（即？※ 和※的字符）
 * user/※/createUser匹配/user/aaa/createUser , /user/bbb/createUser等URL
 * user/createUser?? :匹配/user/createUseraa,/user/createUserbb 等URL   【带占位符URL】
 * user/{userId} 匹配user/123,user/456等URL
 *   
 * 创建人：boys  
 * 创建时间：2017年6月17日 下午3:56:04        
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/doboxTest")
	public String test(HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("user="+userService);
		User user = userService.getUserById("");
		
		
		System.out.println("user="+user.getName());
		request.setAttribute("user", user);
		
		return "user/test";
	}
	
	/**
	 * URL中的{XXX}占位符可以通过@Path Variable("xxx")绑定到操作方法中的入参中。类定位处requestMapping的URL如果使用
	 * 占位符的参数，也可以绑定到处理方法的入参中
	 * @param userId
	 * @return
	
	@RequestMapping("/{userId}")
	public String showDetail(@PathVariable("userId")String userId){
		
		System.out.println("showDetail userId="+userId);
		
		return "user/test";
	} */
	
	/**
	 * requestMapping除了可以使用请求URL映射请求外，还可以使用请求方法、请求头参数及请求参数（报文体和URL包含的请求参数）
	 * 映射请求。
	 * value 请求URL
	 * method 请求方法
	 * params 请求参数以及报文头的映射条件
	 * headers 报文头的映射条件
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST,params="userId")
	public String test2(@RequestParam("userId") String userId){
		
		System.out.println("test2 userId="+userId);
		
		return "user/test";
	}
	
	
	
	
}
