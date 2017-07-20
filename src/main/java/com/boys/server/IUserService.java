package com.boys.server;

import com.boys.bean.User;


public interface IUserService {
   
	
	public void creteUser(User user);

	public User getUserById(String userId);
	
}
