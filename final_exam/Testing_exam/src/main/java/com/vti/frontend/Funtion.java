package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.enity.User;
import com.vti.ultis.JDBCUtils;
import com.vti.ultis.Scannerultis;

public class Funtion {
	static JDBCUtils jbdcultis = new JDBCUtils();
	public static void getuserbyid() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		List<User> users = new ArrayList<User>();
		Connection connection = jbdcultis.getConnection();
		String sql = "SELECT *FROM `project` P left join `USER` E on P.projectId = E.projectId;" ;
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			User user = new User(resultSet.getString("Projectname"), resultSet.getString("FullName"),
					resultSet.getString("Email"));
			users.add(user);
		}
		System.out.print("Mời bạn nhập vào tên: ");
		String Projectname = Scannerultis.inputName();
		try {
			for (User user : users) {
				if (user.getProjectname() == Projectname) {
					System.out.printf("%-12s%-25s%s\n", "Projectname", "fullname", "email");
					System.out.printf("%-12s%-25s%s\n", user.getProjectname(), user.getFullname(), user.getEmail());
				}
			}
		} catch (Exception e) {
			System.out.println("Projectname không tồn tại!");
			System.out.println("mời bạn nhập lại : ");
		}
		
		jbdcultis.disconnect();

	}
//	public void login() throws ClassNotFoundException, SQLException {
//		while (true) {
//			System.out.print("Mời bạn nhập vào Email của account: ");
//			String email = Scannerultis.inputemail("Email chưa đúng định dạng.");
//
//			System.out.print("Mời bạn nhập password: ");
//			String password = Scannerultis
//					.inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
//			Funtion funtion = new Funtion();
//			try {
//				for (User iterable_element : iterable) {
//					
//				}
//				return;
//
//				} catch (Exception e) {
//					System.err.println(e.getMessage());
//				}
//
//			
//		}
//	}
//	
}
