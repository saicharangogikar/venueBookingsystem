package com.bookingapp.model;

import com.bookingapp.exception.AlreadyFound;
import com.bookingapp.manager.BookingManager;

public class User implements Searchable{
	 private int id;;
	    private String name;
	    private String email;

	    public User(int id, String name, String email) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	    }

	    public void search(String location, Venue[] venues) {
	        System.out.println("[INFO] Venues in " + location + ":");
	        int count = 1;
	        for (Venue v : venues) {
	            if (v.location.equalsIgnoreCase(location)) {
	                System.out.println("   " + count++ + ". " + v.toString());
	            }
	        }
	    }

	    public Booking bookVenue(Venue venue, String date) throws AlreadyFound {
	        BookingManager manager = BookingManager.getInstance();
	        // Check if already booked for same venue and date
	        if (manager.isBooked(venue.name, date)) {
	            throw new AlreadyFound(venue.name + " is already booked for " + date + ".");
	        }
	        String bookingId = "BK" + (manager.getBookingCount() + 101);
	        Booking booking = new Booking(bookingId, venue, this, date);
	        manager.addBooking(booking);
	        return booking;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
		
}
