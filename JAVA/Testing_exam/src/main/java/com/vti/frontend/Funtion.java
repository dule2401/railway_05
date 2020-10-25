package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.UserController;
import com.vti.enity.User;
import com.vti.ultis.JDBCUtils;
import com.vti.ultis.Scannerutils;

/**
 * This class is .
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Oct 25, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Oct 25, 2020
 */
public class Funtion {
	static JDBCUtils jbdcultis = new JDBCUtils();
	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 */
	public List<User> getlisuser() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		List<User> users = new ArrayList<User>();
		Connection connection = jbdcultis.getConnection();
		String sql = "SELECT * FROM usermanager.employee";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			User user = new User(resultSet.getInt("EmployeeID"), resultSet.getString("fullname"),
					resultSet.getString("email"));
			users.add(user);
		}
		return users;
	}
	public static void getuserbyid() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		List<User> users = new ArrayList<User>();
		Connection connection = jbdcultis.getConnection();
		String sql = "SELECT * FROM usermanager.employee";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			User user = new User(resultSet.getInt("projectId"), resultSet.getString("fullname"),
					resultSet.getString("email"));
			users.add(user);
		}
		System.out.print("Mời bạn nhập vào id: ");
		int id = Scannerutils.inputInt();
		for (User user : users) {
			if (user.getProjectId() == id) {
				System.out.printf("%-12s%-25s%s\n", "id", "fullname", "email");
				System.out.printf("%-12s%-25s%s\n", user.getProjectId(), user.getFullname(), user.getEmail());
			}
		}
		jbdcultis.disconnect();

	}

	public static void getManagerbyid() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		List<User> users = new ArrayList<User>();
		Connection connection = jbdcultis.getConnection();
		String sql = "SELECT *\r\n" + 
				"FROM `employee` E\r\n" + 
				"LEFT JOIN `project` P  ON E.projectId = P.projectId;";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			User user = new User(resultSet.getInt("EmployeeID"),resultSet.getInt("idManager"),resultSet.getInt("projectId"), resultSet.getString("fullname"	),resultSet.getString("email"));
					users.add(user);
		}
		System.out.print("Mời bạn nhập vào id của project : ");
		
		int projectId = Scannerutils.inputInt();
		System.out.println("nhân viên manager của project " + projectId + " là :" );
		for (User user : users) {
			if (user.getProjectId() == projectId) {
				
			} else if (user.getIdManager() == 1)  {
				System.out.printf("%-12s%-25s%s\n", user.getId(), user.getFullname(), user.getEmail());
			}
		}
				
		jbdcultis.disconnect();

	}
	public void login() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.print("Mời bạn nhập vào Email của account: ");
			String email = Scannerutils.inputemail("Email chưa đúng định dạng.");

			System.out.print("Mời bạn nhập password: ");
			String password = Scannerutils
					.inputPassword("Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!");
			UserController userController = new UserController() ;
			Funtion funtion = new Funtion();
			try {
				System.out.println(userController.login(email, password));
				System.out.println("Login successfull!");
				return;

				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

			
		}
	}
}
