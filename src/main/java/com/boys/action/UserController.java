package com.boys.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 *    
 * ��Ŀ���ƣ�boys   
 * �����ƣ�UserController   
 * �������� spring MVC ͨ��һ��@Controllerע�⼴�ɽ�һ��POJOת��Ϊ��������Ŀ�������ͨ��RequestMappingΪ������ָ������
 * ��ЩURL������
 * 
 *   
 * �����ˣ�boys  
 * ����ʱ�䣺2017��6��17�� ����3:56:04        
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
