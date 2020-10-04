package com.vti.backend;

import com.vti.entity.Group;
import com.vti.entity.Account;
import com.vti.entity.Department;
import java.time.LocalDate;
public class Exercise1 {
	public void question1() {
		
	
	Department s1 = new Department();
	Department s2 = new Department(0, "java");
	System.out.println(s1);
	System.out.println(s2);
	
}
	public void question2() {
		Account account = new Account();
		System.out.println(account);
		
		Account account1 = new Account("alka.asura@gmail.com");
		System.out.println(account1);
		Position position1 = new Position(1, "Sale");
		Account account2 = new Account(3, "alka.asura@gmail.com", "dule240197", "Lê Ngọc", "Du",position1)
		LocalDate.parse("2020-05-15"));
		System.out.println(account2);
	}
	public void question3() {
		Group group = new Group();
		System.out.println(group);
		
		Account creator = new Account(1, "account1@gmail.com", "account1", "Nguyễn văn", "A", null);
		Account account2 = new Account(2, "account2@gmail.com", "account2", "Nguyễn văn", "B",null);
		Account account3 = new Account(3, "account3@gmail.com", "account3", "Nguyễn văn", "C",null);
		Account[] accounts = { creator, account2, account3 };
		Group group1 = new Group();
		System.out.println(group1);
	}
}