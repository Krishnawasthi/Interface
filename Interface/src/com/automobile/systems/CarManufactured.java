package com.automobile.systems;

public interface CarManufactured {

	public void vehicleId();
	public void vehicleName();
	public void VehicleModel();
	public void vehicleVarient();
	
	//we are introducIng the ABS technology
	public  default void absTechnology() {
		
		System.out.println("CarManufactured.absTechnology()");
	}
	
}
