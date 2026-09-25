package com.interfaces.practice;
interface Bird{
	
	 void fly();
	
} 

interface Plane {
	
	void fly();
}
		
		
class Eagle implements Bird, Plane{

	@Override
	public void fly() {
	
		System.out.println("Eagle.fly()");
		
	}
	
}


public class WhoFly {

	public static void main(String[] args) {
		
		
		Eagle eg = new Eagle();
		eg.fly();
		
		
				
				
	}

}
