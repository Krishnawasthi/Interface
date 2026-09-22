package com.interfaces.mutipleinheritance;

public interface BankAccount {
	
public static final int MIN_BALANCE = 1000;

  public abstract void depositAmount(double amount);
                  void withdrawAmount(double amount);
                  void checkBalance();
                  default void calInterest(float rate) {
                	  
                  }
}
