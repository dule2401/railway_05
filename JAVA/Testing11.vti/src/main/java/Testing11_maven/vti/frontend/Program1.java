package Testing11_maven.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Testing11_maven.vti.backend.businesslayer.AccountService;
import Testing11_maven.vti.backend.datalayer.AccountRepository;
import Testing11_maven.vti.backend.presentationlayer.AccountController;
import Testing11_maven.vti.enity.Account;

/**
 * This class is .
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Oct 23, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Oct 23, 2020
 */
public class Program1 {
	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 23, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 23, 2020
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws FileNotFoundException
	 * @throws SQLException
	 * @throws IOException
	 */
	public static void main(String[] args)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		AccountRepository accountRepository = new AccountRepository();
		List<Account> accounts = accountRepository.getListAccounts();
		for (Account account : accounts) {
			System.out.println(account);

		}

	}
}
