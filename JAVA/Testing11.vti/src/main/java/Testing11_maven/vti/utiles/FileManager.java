package Testing11_maven.vti.utiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FileManager {
public void createAccount() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
	JDBCUtils jdbcutils =  new JDBCUtils();
	Connection connection = jdbcutils.getConnection();
	String url = "INSERT INTO Account ( username, fullname)\" + \"VALUE (   ? 	,   ?	)\";";
	Statement statement = connection.createStatement();

	ResultSet resultSet = statement.executeQuery(url);
	
	
	
	
}
}
