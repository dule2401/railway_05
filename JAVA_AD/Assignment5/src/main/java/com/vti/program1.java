package com.vti;

import com.vti.Entity.Account;
import com.vti.repository.RepositoryAccount;

public class program1 {
public static void main(String[] args) {
	RepositoryAccount RepositoryAccount =  new RepositoryAccount() ;
	Account account = RepositoryAccount.getAccountByID((short) 1);
	System.out.println(account);
}
}
