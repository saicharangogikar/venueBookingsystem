package com.bookingapp.model;

public class FunctionHall extends Venue{

	public FunctionHall(int id, String name, String location, double price, int capacity) {
        super(id, name, location, price, capacity);
    }

    @Override
    public double calculateFinalPrice(String date) {
        // Just return base price, no seasonal logic here for simplicity
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
