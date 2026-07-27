package com.staticprivate.payment;

public class CardPayment  implements IPayment
{

	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");
		
	}

	@Override
	public void settle() {
		System.out.println("CardPayment.settle()");
		
	}

	@Override
	public void cancelPay() {
		System.out.println("CardPayment.cancelPay()");
		
		double amount = 18333; 
		double Ttax = IPayment.calTax(amount , 12);
		double balance = amount + Ttax;
		
		System.out.println("totalTax: " + Ttax);
		System.out.println("totalbalance: " + balance);
		
		
		
		
	}
	
	//when there are some common methods for each class we are rewriting the same function again and again
	

	
	
	
	

}
