package com.object.cloning;

 class Employeee implements Cloneable {
	
   String name;
   String location;
   
   public Employeee(String name, String location) {
	super();
	this.name = name;
	this.location = location;
   }
   @Override
   public Object clone() throws CloneNotSupportedException{
	   
	   return super.clone();
	   
   }
   //That means, if you want to control something, if you want to control some critical activity,
   //which should not be allowed, which should not be allowed.
   //without the permission of owner. Without the permission of the owner. 
   //What are those activities->  Cloning, Serializable
   
	
}
 public  class Employee{
	 
	 public static void main(String[] args) throws CloneNotSupportedException {
		Employeee   e = new Employeee("krishna","lko");
		
		Employeee e1 = (Employeee) e.clone(); 
		
		System.out.println(e1.location+" "+ e1.name);
		
	}
 }