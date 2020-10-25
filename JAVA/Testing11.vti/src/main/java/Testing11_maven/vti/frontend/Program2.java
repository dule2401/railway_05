package Testing11_maven.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Testing11_maven.vti.backend.businesslayer.AccountService;
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
public class Program2 {
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
 * @throws IOException 
 * @throws SQLException 
 * @throws FileNotFoundException 
 * @throws ClassNotFoundException 
 */
public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
	AccountService as = new AccountService() ;
	List<Account> accounts =  as.getListAccounts();
	for (Account account : accounts) {
		System.out.println(account);
	}
}
}
