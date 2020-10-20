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

public class Transaction {
public static void deletedepartmentid3() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
	Properties properties = new Properties();
	properties.load(new FileInputStream("src\\main\\resource\\database.properties"));
	String url = properties.getProperty("url1");
	String username = properties.getProperty("username");
	String password = properties.getProperty("password");
	String driver = properties.getProperty("Driver");
	Class.forName(driver);
	Connection connection = DriverManager.getConnection(url, username, password);
	Statement statement = connection.createStatement();
	String sql = "SELECT * FROM quan_ly_phong_ban.account";
	ResultSet resultset = statement.executeQuery(sql);
	String deleteaccount = "DELETE FROM `account` WHERE department_id = 3" ;
	String sql1 = "SELECT * FROM quan_ly_phong_ban.department";
	ResultSet resultset1 = statement.executeQuery(sql1);
	String deletedepartment = "DELETE FROM department WHERE department_id = 3" ;
	int row = 	statement.executeUpdate(deletedepartment);
	System.out.println(row);
	System.out.println("thành công ");
	
}
}
