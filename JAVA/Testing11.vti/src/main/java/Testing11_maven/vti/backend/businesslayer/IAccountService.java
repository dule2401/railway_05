package Testing11_maven.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import Testing11_maven.vti.enity.Account;

public interface IAccountService {
	List<Account> AccountService() throws ClassNotFoundException, SQLException;

}
