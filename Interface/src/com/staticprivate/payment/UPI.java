package com.staticprivate.payment;

public class UPI implements IPayment {

	@Override
	public void pay() {
		System.out.println("UPI.pay()");
	}

	@Override
	public void settle() {
		System.out.println("UPI.settle()");
		
	}

	@Override
	public void cancelPay() {
		double Ttax = IPayment.calTax(13000 , 8);
		System.out.println("UPI.cancelPay()");
		System.out.println(Ttax);
		
		
	}

	
	
}
