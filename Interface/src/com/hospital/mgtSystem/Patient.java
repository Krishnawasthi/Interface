package com.hospital.mgtSystem;

public class Patient implements Hospital{

	@Override
	public void doctorSpecialization() {
		System.out.println("Patient.doctorSpecialization()");
		
	}

	@Override
	public void appointmentServices() {
		System.out.println("Patient.appointmentServices()");
		
	}

	@Override
	public void billing() {
		double totalFee = Hospital.appointmentFee(10000, 210);
		System.out.println(totalFee);
		System.out.println("Patient.billing()");
		
	}
	
	
	
	
	

}
