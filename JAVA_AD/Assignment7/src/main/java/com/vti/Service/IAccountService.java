package com.vti.Service;

import java.util.List;

import com.vti.entity.Account;

public interface IAccountService {
	public List<Account> getAllAccounts();

	public Account getAccounttByID(short id);

	public Account getAccountByName(String name);

	public void createAccount(Account account);

	public void updateAccount(short id, String newName);

	public void updateAccount(Account account);

	public void deleteAccount(short id);

	public boolean isAccountExistsByID(short id);

	public boolean isAccountExistsByName(String name);
}
