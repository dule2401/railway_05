package com.vti.DTO;

import com.vti.entity.Account;

public class AccountDTO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountDTO() {
	}

	public Account toEntity() {
		return new Account(name);
	}
}
