package com.kodewala.interface1;

public class Yourshow implements BookmyShow {

	@Override
	public void allShows() {
	System.out.println("Yourshow.Allshows()");
		
	}

	@Override
	public void seatBookins() {
	
	System.out.println("Yourshow.seatBookins()");
	}

	@Override
	public void yourBookings() {
		
	System.out.println("Yourshow.yourBookings()");
	}

	@Override
	public void yourShow() {
		System.out.println("Yourshow.yourShow()");
	}

}
