package com.interfaces.practice;

interface Bank{
	
	public abstract void minBalance();
	void dopayment();
	
	default void netBanking() {
		
		
	}
	
	
}
class SBI implements Bank {

	@Override
	public void  minBalance() {
		
		System.out.println("min balance :"+ 1000);
	}

	@Override
	public void dopayment() {
		System.out.println(" tell Payement method upi cash netbanking");
		
	}
	
	
}


class Graminbank implements Bank{

	@Override
	public void minBalance() {
		System.out.println("min balance :"+ 500);
		
	}

	@Override
	public void dopayment() {
		System.out.println(" tell Payement method  cash ");
		
	}
	
	
	
}


public class ExampleDriver1 {

	public static void main(String[] args) {
		

	}

}
