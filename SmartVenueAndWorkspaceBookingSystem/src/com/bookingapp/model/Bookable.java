package com.bookingapp.model;

public interface Bookable {
	 void book(String date) throws Exception;
	    void cancelBooking(String date);

}
