package com.bookingapp.factory;

import com.bookingapp.model.FunctionHall;
import com.bookingapp.model.Tolet;
import com.bookingapp.model.Venue;
import com.bookingapp.model.WorkSpace;

public class VenueFactory {
	 public static Venue createVenue(String type, int id, String name, String location, double price, int capacity) {
	        switch (type) {
	            case "FunctionHall":
	                return new FunctionHall(id, name, location, price, capacity);
	            case "Workspace":
	                return new WorkSpace(id, name, location, price, capacity);
	            case "ToLet":
	                return new Tolet(id, name, location, price, capacity);
	            default:
	                return null;
	        }
	    }
}
