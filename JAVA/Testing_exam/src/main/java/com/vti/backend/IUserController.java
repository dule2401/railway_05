package com.vti.backend;

import com.vti.enity.User;

public interface IUserController {
	
	User login(String email, String password) throws Exception;
}
