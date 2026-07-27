package com.staticprivate.payment;

public class Driver {

	public static void main(String[] args) {
		
		IPayment u = new UPI();
		u.pay();
		u.settle();
		u.cancelPay();
		
		System.out.println();
		IPayment c = new CardPayment();
		
		c.pay();
		c.settle();
		c.cancelPay();
		
		System.out.println();
		IPayment w = new WirePayment();
		
		w.pay();
		w.settle();
		w.cancelPay();
		
		
		
		
		
		
       
 

	}

}
