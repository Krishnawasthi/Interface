package com.automobile.systems;

public class QADepartment implements  CarManufactured {

	public void vehicleId() {
		System.out.println("QADepartment.vehicleId()");
	}

	@Override
	public void vehicleName() {
		
		System.out.println("QADepartment.vehicleName()");
		
	}

	@Override
	public void VehicleModel() {
		System.out.println("QADepartment.VehicleModel()");
		
	}

	@Override
	public void vehicleVarient() {
		System.out.println("QADepartment.vehicleVarient()");
	}

	@Override
	public void absTechnology() {
		// TODO Auto-generated method stub
		CarManufactured.super.absTechnology();
	}
}
