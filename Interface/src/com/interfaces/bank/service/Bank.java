package com.interfaces.bank.service;

public abstract class Bank {
	
	String name;
	String accountNumber;
	int balance;
	
	public Bank(String name, String accountNumber, int balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	

}
