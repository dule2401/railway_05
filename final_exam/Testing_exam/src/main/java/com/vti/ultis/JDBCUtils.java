package com.vti.ultis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
	private Connection connection;
	Properties properties = new Properties();

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		if (connection == null || connection.isClosed()) {
		properties.load(new FileInputStream("resource\\database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("Driver");
		Class.forName(driver);

		connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}
	public void disconnect() throws SQLException {
		if (connection != null && connection.isClosed()) {
			connection.close();
		}
	}

}
