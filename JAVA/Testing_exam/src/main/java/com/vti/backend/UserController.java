package com.vti.backend;

import com.vti.enity.User;

public class UserController {
	private IUserController userController;

	public User login(String email, String password) throws Exception {
		return userController.login(email, password);
	}
}
