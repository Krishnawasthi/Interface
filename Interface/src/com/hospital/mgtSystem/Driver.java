package com.hospital.mgtSystem;

public class Driver {

	public static void main(String[] args) {
		
		Doctor d = new Doctor();
		d.appointmentServices();
		d.billing();
		d.doctorSpecialization();
		
		
		
		System.out.println();
		
		Patient p = new Patient();
		p.appointmentServices();
		p.billing();
		p.doctorSpecialization();
	}

}
