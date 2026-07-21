package com.kodewala.interface1;


public class CheckShow  implements BookmyShow{

	@Override
	public void allShows() {
	System.out.println("CheckShow.Allshows()");
		
	}

	@Override
	public void seatBookins() {
		
		System.out.println("CheckShow.seatBookins()");
		
	}

	@Override
	public void yourBookings() {
		
		System.out.println("CheckShow.yourBookings()");
	}

	@Override
	public void yourShow() {
		System.out.println("CheckShow.yourShow()");
		
	}

}

