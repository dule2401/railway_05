package com.vti.entity;

public class Accounts {
private int id;
private String name;
private int balance;
private int amount;
public Accounts(int id, String name, int balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}

public int getBalance() {
	return balance;
}
private int credit(int amounts) {
	return  amounts;
}
public int debit(int amount) {
	return amount;
	}
public void tranferTo(Accounts account, int amount) {
	System.out.println("Tranfer " + account + " to " + account.getName());
}
}

