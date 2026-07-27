package com.staticprivate.payment;

public interface IPayment
{
	//from java 8 onwards you can write static methods inside the interface 
     void pay();
     public abstract void settle();             //these are by default public and abstract
     void cancelPay();
     
     public static double calTax(double amount, int taxper) {
   
    	 
    	//20 lines of code ------> database connection logic(now we can write this logic inside the private method)
    	 connectToDB();
   	  double totalTax = amount*taxper/100;
   	  return totalTax;
     }
     
     public  static  double calTax(double amount, int taxper, String name) {
    	//20 lines of code ------> database connection logic (now we can write this logic inside the private method)
    	    connectToDB();
      	  double totalTax = amount*taxper/100;
      	  return totalTax;	  
     }
     private static void connectToDB()
     { 
     //this feature is introduced in java 9
     //this private method inside the interface to solve the problem of writing the same code to connecting with the database again and again.
     //now we write the logic only once inside the private method 
     //20 lines of code ------> database connection logic
     }
}