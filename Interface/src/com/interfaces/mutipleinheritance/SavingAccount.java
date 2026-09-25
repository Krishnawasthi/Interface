package com.interfaces.mutipleinheritance;

public class SavingAccount implements BankAccount,LoanSerive {

	double balance ;
	
	SavingAccount(){
		
		
	}
	
	public SavingAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void depositAmount(double amount) {
		

		balance = balance + amount;
	
		System.out.println("Balance after deposit:" + balance);
		
		
	}
	@Override
	public void calInterest(float rate)
	{
		
		double interest= balance * rate/100;
		balance += interest;
		System.out.println("Your total interest on your balance: " + interest);
		System.out.println("Balance after Interest:" + balance);
		
	}

	@Override
	public void withdrawAmount(double amount) {
		
		if(balance > amount) {
			
			balance -= amount;
			System.out.println("Balance after withdrawal:" + balance);
			
		}
		else {
			
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Your actual current balance is: "+ balance + " Rs");
		
	}

	@Override
	public void applyForLoan(double loanAmount ) {
		
		float interestRate = 0;
		  
		  if(loanAmount <= 500000) {
		   interestRate = 8.5f;
		  
		  }
		  else {
			  
			  interestRate =  10f;
		  }
		  
		  boolean grantStatus = false;
			if(loanAmount <= 2000000) {
				
				grantStatus = true;
			
				System.out.println("You have Applied for the loan your grant got accepted for loan amount of " + loanAmount);
				
				System.out.println("Interest Rate: " + interestRate + "%");
				  
				double interestOn = loanAmount*interestRate *5/100;
				double totalPayback = loanAmount + interestOn ;
				System.out.println("Your interest for next five years: " + interestOn);
				System.out.println("You have to payback this laon Amount to bank in next 5 years and your interest on amount is: " + totalPayback);
			
			}
			 
			else {
				
				System.out.println("Your grant is too high for our standards please"
						+ " read the documents carefully.");
				
			}
		
		
		
	}
	
	

}
