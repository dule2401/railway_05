package Testing10.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Exercise3 {
	public static void deletedatabyid() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src\\main\\resource\\database.properties"));
		String url = properties.getProperty("url1");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("Driver");
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM quan_ly_phong_ban.department";
		ResultSet resultset = statement.executeQuery(sql);
		Scanner scanner = new  Scanner(System.in);
		System.out.println("nhập id department bạn muốn xóa : ");
		int id = scanner.nextInt();
		while (resultset.next()) {
			int department_id = resultset.getInt("department_id");
			String department_name = resultset.getString("department_name");
			if (department_id == id ) {
				String newdepartment = "DELETE FROM department" + " WHERE department_id ='" +  id + "'" ;
				int row = 	statement.executeUpdate(newdepartment);
				System.out.println(row);
				System.out.println("thành công ");
			}
		}
		try {
			 if (id > resultset.getInt("department_id") );
		} catch (Exception e) {
			System.out.println("Department Name is Exists! " + id);
		}
		
	}
}
