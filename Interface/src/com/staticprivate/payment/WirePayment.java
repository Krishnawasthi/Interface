package com.staticprivate.payment;

public class WirePayment  implements IPayment
{

	@Override
	public void pay() {
		System.out.println("WirePayment.pay()");
	}

	@Override
	public void settle() {
		System.out.println("WirePayment.settle()");
	}

	@Override
	public void cancelPay() {
		System.out.println("WirePayment.cancelPay()");
		double Ttax = IPayment.calTax(14543 , 9);
		
		System.out.println(Ttax);
		
		
	}
	

}
