package com.hospital.mgtSystem;

public class Doctor implements Hospital  {

	@Override
	public void appointmentServices() {
		System.out.println("Doctor.appointmentServices()");
		
	}

	@Override
	public void billing() {
		System.out.println("Doctor.billing()");
		double totalFee = Hospital.appointmentFee(10000, 210);
		System.out.println(totalFee);
		
	}

	@Override
	public void doctorSpecialization() {
		System.out.println("Doctor.doctorSpecialization()");
	}
	

	
	
}
