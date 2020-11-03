package com.vti.frontend;

import java.util.List;

import com.vti.backend.datalayer.UserRepository;
import com.vti.enity.User;
import com.vti.ultis.Scannerultis;

public class Funtion {
	private UserRepository userRepository;
	public void getListUser() throws Exception {
		while (true) {
			System.out.print("Mời bạn nhập vào id Project: ");
			int id = Scannerultis.inputInt("ban phai nhan vao id");
			if (userRepository.isUserIdExits(id)) {
				List<User> users = userRepository.getUserByProjectid(id);
				System.out.printf("%-15s %-25s %-25s\n", "Projectname", "Email", "Fullname");
				for (User user : users) {
					System.out.printf("%-15s %-25s %-25s\n", user.getProjectname(), user.getEmail(), user.getFullname());						
				}
				return;
			} else {
				System.err.println("projectname không tồn tại! Mời bạn nhập lại!");
			}
		}
	}
	public void login() {
		while (true) {
			System.out.print("Mời bạn nhập vào Email của user: ");
			String email = Scannerultis.inputemail("Email chưa đúng định dạng. Moi nhap lai!");

			System.out.print("Mời bạn nhập password: ");
			String password = Scannerultis.inputPassword(
					"Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!\nMoi ban nhap lai!");
			try {
				System.out.println(userRepository.login(email, password));
				System.out.println("Login successfull!");
				return;

			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
