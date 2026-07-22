package com.automobile.systems;

public class ProdcutionDepartment  implements  CarManufactured  {
	

	public void vehicleId() {
		System.out.println("ProdcutionDepartment.vehicleId()");
	}

	@Override
	public void vehicleName() {
		
		System.out.println("ProdcutionDepartment.vehicleName()");
		
	}

	@Override
	public void VehicleModel() {
		System.out.println("ProdcutionDepartment.VehicleModel()");
		
	}

	@Override
	public void absTechnology() {
		// TODO Auto-generated method stub
		CarManufactured.super.absTechnology();
	}

	@Override
	public void vehicleVarient() {
		System.out.println("ProdcutionDepartment.vehicleVarient()");
	}

}
