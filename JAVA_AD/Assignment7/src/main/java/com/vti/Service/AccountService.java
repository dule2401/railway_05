package com.vti.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Account;
import com.vti.repository.IAccountRepository;

@Service
public class AccountService implements IAccountService{
	@Autowired
	private IAccountRepository repository;

	public List<Account> getAllAccounts() {
		return repository.getAllAccounts();
	}

	public Account getAccounttByID(short id) {
		return repository.getAccountByID(id);
	}

	public Account getAccountByName(String name) {
		return repository.getAccountByName(name);
	}

	public void createAccount(Account account) {
		repository.createAccount(account);
	}

	public void updateAccount(short id, String newName) {
		repository.updateAccount(id, newName);
	}

	public void updateAccount(Account account) {
		repository.updateAccount(account);
	}

	public void deleteAccount(short id) {
		repository.deleteAccount(id);
	}

	public boolean isAccountExistsByID(short id) {
		return repository.isAccountExistsByID(id);
	}

	public boolean isAccountExistsByName(String name) {
		return repository.isAccountExistsByName(name);
	}

}
