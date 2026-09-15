package com.interfaces.bank.service;
    /* Interface is used to making the set of requirements that are commonly used by the class
     * It makes the contracts not implementation
     * It ensure that class must implements the contract
     * 
     *  */
interface BankAccount{
	
	//All the fields will be public static final by defaults
	public static final double MIN_BALANCE = 2000;
	
	/*  1.All the methods will be public absract by default 
	    2.We will achieve 100% Abstraction with interface.
	    3.It makes the contract for the class.
	    4.Therefore it does not have body for the mehtods
	    5.It makes the contracts for the classes sharing common functionalities.
	                */
	public abstract void deposit(int amount);
	public abstract void withdraw(int amount);
	public abstract void checkBalance();
	
}

class BankOfBaroda extends Bank implements BankAccount{
	static {
		
		System.out.println("Bank Name: Bank of Baroda");	
	}
	public BankOfBaroda(String name, String accountNumber, int balance) {
		super(name, accountNumber, balance);
		
		
	}

	@Override
	public void deposit(int amount) {
	System.out.println("Account Holder Name: "+ name);
	System.out.println("Account Number: "+ accountNumber);

	System.out.println("Initail Balance: "+ balance);
	System.out.println("Deposit Money: "+ amount);
	balance += amount;
	System.out.println("Current Balance: "+ balance);
	System.out.println("---------------------------------------------------------------------");
	}

	@Override
	public void withdraw(int amount) {	
		
		System.out.println("Account Holder Name: "+ name);
		System.out.println("Account Number: "+ accountNumber);

		System.out.println("Initail Balance: "+ balance);
		System.out.println("Withdraw Money: "+ amount);
		balance -= amount;
		System.out.println("Current Balance: "+ balance);
		System.out.println("---------------------------------------------------------------------");
		}
		

	@Override
	public void checkBalance() {
		
		System.out.println("Balance in your Account: " + balance);
		
	}

	
}

class PanjabNatiionalBank extends Bank implements BankAccount{

	static {
	
		System.out.println("Bank Name: Panjab National Bank");	
	}
	
	public PanjabNatiionalBank(String name, String accountNumber, int balance) {
		
		super(name, accountNumber, balance);
	}
	
	
	@Override
	public void deposit(int amount) {
		
		System.out.println("Account Holder Name: "+ name);
		System.out.println("Account Number: "+ accountNumber);

		System.out.println("Initail Balance: "+ balance);
		System.out.println("Deposit Money: "+ amount);
		balance += amount;
		System.out.println("Current Balance: "+ balance);
		System.out.println("---------------------------------------------------------------------");
		
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Account Holder Name: "+ name);
		System.out.println("Account Number: "+ accountNumber);

		System.out.println("Initail Balance: "+ balance);
		System.out.println("Withdraw Money: "+ amount);
		balance -= amount;
		System.out.println("Current Balance: "+ balance);
		System.out.println("---------------------------------------------------------------------");
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Balance in your Account: " + balance);
	}

	
	
	
	
}




public class Banking {

	public static void main(String[] args) {
		
		BankOfBaroda bob = new BankOfBaroda("Krishna Mohan Awasthi", "11900004343004",3500);
		bob.deposit(1500);
		bob.withdraw(1500);
		bob.checkBalance();
		System.out.println("-----------------------------------------------------------------------");
		PanjabNatiionalBank pnb = new PanjabNatiionalBank("Mradul Awasthi", "110034005440", 45550);
		pnb.deposit(31000);
		pnb.withdraw(8000);
		pnb.checkBalance();
		

	}

}
