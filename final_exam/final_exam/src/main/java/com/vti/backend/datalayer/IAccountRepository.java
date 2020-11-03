package com.vti.backend.datalayer;


import java.sql.SQLException;
import java.util.List;

import com.vti.enity.User;

public interface IAccountRepository {
		List<User> getListUser() throws ClassNotFoundException, SQLException;

}
