package com.boys.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 
 *    
 * ��Ŀ���ƣ�boys   
 * �����ƣ�UserController   
 * �������� spring MVC ͨ��һ��@Controllerע�⼴�ɽ�һ��POJOת��Ϊ��������Ŀ�������ͨ��RequestMappingΪ������ָ������
 * ��ЩURL������
 * RequestMapping����֧�ֱ�׼��URL����֧��Ant��񣨼����� �͡����ַ���
 * user/��/createUserƥ��/user/aaa/createUser , /user/bbb/createUser��URL
 * user/createUser?? :ƥ��/user/createUseraa,/user/createUserbb ��URL   ����ռλ��URL��
 * user/{userId} ƥ��user/123,user/456��URL
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
		
		System.out.println("test  test="+test);
		
		return "user/test";
	}
	
	/**
	 * URL�е�{XXX}ռλ������ͨ��@Path Variable("xxx")�󶨵����������е�����С��ඨλ��requestMapping��URL���ʹ��
	 * ռλ���Ĳ�����Ҳ���԰󶨵��������������
	 * @param userId
	 * @return
	
	@RequestMapping("/{userId}")
	public String showDetail(@PathVariable("userId")String userId){
		
		System.out.println("showDetail userId="+userId);
		
		return "user/test";
	} */
	
	/**
	 * requestMapping���˿���ʹ������URLӳ�������⣬������ʹ�����󷽷�������ͷ����������������������URL���������������
	 * ӳ������
	 * value ����URL
	 * method ���󷽷�
	 * params ��������Լ�����ͷ��ӳ������
	 * headers ����ͷ��ӳ������
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST,params="userId")
	public String test2(@RequestParam("userId") String userId){
		
		System.out.println("test2 userId="+userId);
		
		return "user/test";
	}
	
	
	
	
}
