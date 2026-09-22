package com.interfaces.mutipleinheritance;

public class BankCounter {

	public static void main(String[] args) {
	
		SavingAccount sa = new SavingAccount(3300);
		
		sa.depositAmount(3000);
		sa.calInterest((float) 7.5);
		sa.withdrawAmount(1300);
		sa.checkBalance();
		
		LoanSerive ls = new SavingAccount();
		   ls.applyForLoan(2000000);
		
	}

}
