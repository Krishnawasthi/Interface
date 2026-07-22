package com.automobile.systems;

public class ServiceDepartment implements  CarManufactured  {

	
	public void vehicleId() {
		System.out.println("ServiceDepartment.vehicleId()");
	}

	@Override
	public void vehicleName() {
		
		System.out.println("ServiceDepartment.vehicleName()");
		
	}

	

	@Override
	public  void absTechnology() {
		
		System.out.println("absTechnology()");
	}

	@Override
	public void VehicleModel() {
		System.out.println("ServiceDepartment.VehicleModel()");
		
	}

	@Override
	public void vehicleVarient() {
		System.out.println("ServiceDepartment.vehicleVarient()");
	}

}
