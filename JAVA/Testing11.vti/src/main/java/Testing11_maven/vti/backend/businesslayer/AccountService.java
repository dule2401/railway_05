package Testing11_maven.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Testing11_maven.vti.backend.datalayer.AccountRepository;
import Testing11_maven.vti.enity.Account;

public class AccountService {
	public List<Account> getListAccounts() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		AccountRepository ars = new AccountRepository() ;
		
		return ars.getListAccounts() ;

	}
}
