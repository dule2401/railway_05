package Testing11_maven.vti.backend.datalayer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import Testing11_maven.vti.enity.Account;
import Testing11_maven.vti.utiles.JDBCUtils;

public class AccountRepository {
	private JDBCUtils jdbcutils =  new JDBCUtils();
	public List<Account>  getListAccounts() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		List<Account> accounts = new ArrayList<Account>();
		Connection connection = jdbcutils.getConnection();
		String sql = "SELECT account_id,username,fullname FROM quan_ly_phong_ban.`account`";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("account_id"),resultSet.getString("username"), resultSet.getString("fullname"));

			accounts.add(account);
		}
		jdbcutils.disconnect();
		return accounts ;
	}
}
