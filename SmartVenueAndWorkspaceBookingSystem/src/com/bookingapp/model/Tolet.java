package com.bookingapp.model;

public class Tolet extends Venue{

	
		public Tolet(int id, String name, String location, double price, int capacity) {
		super(id, name, location, price, capacity);
		// TODO Auto-generated constructor stub
	}

		

	    @Override
	    public double calculateFinalPrice(String date) {
	        return price;
	    }
		@Override
		public void book(String date) throws Exception {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void cancelBooking(String date) {
			// TODO Auto-generated method stub
			
		}
}
