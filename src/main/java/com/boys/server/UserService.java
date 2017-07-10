package com.boys.server;

import org.springframework.stereotype.Service;

import com.boys.bean.User;

@Service
public class UserService {
   
	
	public void createUser(User user){
		System.out.println("save user.");
	}

	public User getUserById(String userId) {
		User user = new User();
		user.setAge(22);
		user.setId(1);
		user.setName("°¢±ó");
		return user;
	}
	
}
