package com.vti.entity;


import java.time.LocalDate;

public class Account {
	int accountID;
	String email;
	String username;
	String fullName;
	Department department;
	LocalDate createDate;
	String position;

	public Account() {

	}

	public Account(int accountID, String email, String username, String firstName, String lastName, String position) {
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = firstName + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	public Account(String usernames) {

		this.username = usernames;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", \nemail=" + email + ",  \nusername=" + username + ", \nfullName="
				+ fullName + ", \ndepartment=" + department + ", \ncreateDate=" + createDate + ", \nposition=" + position
				+ "]";
	}

}
