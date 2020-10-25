package Testing11_maven.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import Testing11_maven.vti.enity.Account;

public interface IAccountRepository {
		List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

}
