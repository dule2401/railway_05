package Testing10.vti.enity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Scanner;

public class question1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		//question3_1() ;
		question4();
	}
	public question1() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new  FileInputStream("src\\main\\resource\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver =  properties.getProperty("Driver");
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM question_level";
		System.out.println("kết nối thành công");
	}

	public void question2() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new  FileInputStream("src\\main\\resource\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver =  properties.getProperty("Driver");
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		// step 3
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM question_level";
		ResultSet resultset = statement.executeQuery(sql);
		while (resultset.next()) {
			int id = resultset.getInt("id");
			String level = resultset.getString("level");

			System.out.println("id: " + id);
			System.out.println("level: " + level);

		}
	}

	public static void question3() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new  FileInputStream("src\\main\\resource\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver =  properties.getProperty("Driver");
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tên group bạn muốn nhập: ");
		String name = scanner.nextLine();
		System.out.println("nhập id  người tạo: ");
		String author_ID= scanner.nextLine();
		String sql = "INSERT INTO `Group` (`name` ,	`author_ID`, create_time)" + "VALUES('"+ name + "','"+ author_ID +  "')";
		int row = 	statement.executeUpdate(sql);
		System.out.println(row);
		System.out.println("thành công ");
	}
	public static void question3_1() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new  FileInputStream("src\\main\\resource\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver =  properties.getProperty("Driver");
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "INSERT INTO `Group` (`name` ,	`author_ID`, create_time)" + "VALUES(? , ? )";
		PreparedStatement statement = connection.prepareStatement(sql);
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tên group bạn muốn nhập: ");
		String name = scanner.nextLine();
		System.out.println("nhập id  người tạo: ");
		int author_ID= scanner.nextInt();
		
		statement.setString(1,name);
		statement.setInt(2,author_ID);
	
		int row = 	statement.executeUpdate();
		System.out.println(row);
		System.out.println("thành công ");
	}
	public static void question4() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new  FileInputStream("src\\main\\resource\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver =  properties.getProperty("Driver");
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		String sql = "UPDATE `Group`" + " SET `name` = ?" + " WHERE id = 1";
		PreparedStatement statement = connection.prepareStatement(sql);
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tên group bạn muốn nhập: ");
		String name = scanner.nextLine();
		statement.setString(1,name);
		int row = 	statement.executeUpdate();
		System.out.println(row);
		System.out.println("thành công ");
	}
}
