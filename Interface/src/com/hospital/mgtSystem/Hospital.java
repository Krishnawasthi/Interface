package com.hospital.mgtSystem;

public interface Hospital {
     
	public void appointmentServices();
	public void billing();
	
	
  public default void doctorSpecialization() {
	  connectedDb();
	  System.out.println("Hospital.doctorSpecialization()");
  }
	  
 public static double appointmentFee(double amount, int gst)
 {
	 connectedDb();
	 double totalAmount = amount + gst;
	 return totalAmount;
 }
 
 public static String gererateAppointmentNumber(String appointmentNumber){
	 
	 connectedDb();
	 return appointmentNumber;
	 
 }
 
   private static  void connectedDb() {
	 
	 System.out.println("connected to database ");
   }
 
	 
 
}