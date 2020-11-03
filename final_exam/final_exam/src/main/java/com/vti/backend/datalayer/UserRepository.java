package com.vti.backend.datalayer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.vti.enity.User;
import com.vti.ultis.JDBCUtils;

public class UserRepository {
	private JDBCUtils jdbcutils =  new JDBCUtils();
	Connection connection;
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		try {
			connection = jdbcutils.getConnection();
			String sql = "SELECT * FROM final_exam.project where projectId = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			}
			return false;
		} finally {
			connection.close();
		}
	}
	public List<User> getUserByProjectid(int id) throws Exception {
		List<User> users = new ArrayList<User>();
		try {
			connection = jdbcutils.getConnection();
			String sql = "SELECT *FROM `project` P left join `USER` E on P.projectId = E.projectId WHERE projectId = ?" ;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				int projectId = resultSet.getInt("projectId");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
			
				User user = new User(projectId, fullName, email);

				users.add(user);
			}
			return users;
		} finally {
			connection.close();
		}
	}
	public User login(String email, String password) throws Exception {

		try {
			connection = jdbcutils.getConnection();
			String sql = "SELECT userid, FullName, Email " + "FROM `USER` " + "WHERE Email = ? AND `Password` = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("userid"));
				user.setFullname(resultSet.getString("FullName"));
				user.setEmail(resultSet.getString("Email"));

				return user;
			} else {
				throw new Exception("\nEmail hoac mat khau sai!Moi ban nhap lai!\n");
			}

		} finally {
			connection.close();
		}

	}

}
