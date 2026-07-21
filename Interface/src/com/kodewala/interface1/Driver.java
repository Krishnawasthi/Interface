package com.kodewala.interface1;

class Ishow {
	
	//this is polymorphism here we are.
	
	public void show(BookmyShow bs) {
	bs.allShows();
	bs.seatBookins();
	bs.yourBookings();
	bs.yourShow();
}
}

public class Driver {

	public static void main(String[] args) {
		
      Ishow ishow = new Ishow();

	   ishow.show(new CheckShow());
	   System.out.println();
	   ishow.show(new Yourshow());
		
	}
	
}
