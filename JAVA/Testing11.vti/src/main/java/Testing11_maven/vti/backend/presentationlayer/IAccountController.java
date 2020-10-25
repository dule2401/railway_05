package Testing11_maven.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Testing11_maven.vti.enity.Account;

public interface IAccountController {
List<Account> AccountController () throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}