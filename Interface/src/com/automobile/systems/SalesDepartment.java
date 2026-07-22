package com.automobile.systems;

public class SalesDepartment implements CarManufactured 
{
	public void vehicleId() {
		System.out.println("SalesDepartment.vehicleId()");
	}

	@Override
	public void vehicleName() {
		
		System.out.println("SalesDepartment.vehicleName()");
		
	}

	@Override
	public void VehicleModel() {
		System.out.println("SalesDepartment.VehicleModel()");
		
	}

	@Override
	public void vehicleVarient() {
		System.out.println("SalesDepartment.vehicleVarient()");
	}

}
