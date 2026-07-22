package com.automobile.systems;

public class Driver {

	public static void main(String[] args) {
		ProdcutionDepartment pd = new ProdcutionDepartment();
		pd.absTechnology();
		pd.vehicleId();
		pd.VehicleModel();
		pd.vehicleName();
		pd.vehicleVarient();
		System.out.println("--------------------------------------------------------------------------------------");
	   QADepartment qa = new  QADepartment();
	    qa.absTechnology();
		qa.vehicleId();
		qa.VehicleModel();
		qa.vehicleName();
		qa.vehicleVarient();
		System.out.println("--------------------------------------------------------------------------------------");
		RegulatoryDepartment rd = new RegulatoryDepartment();
	    rd.absTechnology();
	    rd.vehicleId();
	    rd.VehicleModel();
	    rd.vehicleName();
	    rd.vehicleVarient();
	    
	    System.out.println("--------------------------------------------------------------------------------------");
	    SalesDepartment sd = new SalesDepartment();
	    sd.absTechnology();
	    sd.vehicleId();
	    sd.VehicleModel();
	    sd.vehicleName();
	    sd.vehicleVarient();
		
		
	}

}
