package com.remote.cloning;


class Address  
{
	
	String line;
	public Address(String line)
	{
		this.line = line;
	}
}

class Employee implements Cloneable
{
	 String name;
	 Address address;
	 
	 public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address; 
		
		 
	 }
	 
	 @Override
	 public Object clone() throws CloneNotSupportedException
	 {
		 return super.clone();                 //cloneable marker interface
	 }
	 
	 
	
}

public class Driver  {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("krishna", new Address("btm second stage"));	
		
		Employee e1 = (Employee) e.clone();
		
		System.out.println(e1.name +" "+ e1.address.line);
		
	 
	}

}
