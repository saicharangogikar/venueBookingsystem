package com.bookingapp.manager;

import java.util.ArrayList;

import com.bookingapp.exception.AlreadyFound;
import com.bookingapp.model.Booking;
import com.bookingapp.model.User;
import com.bookingapp.model.Venue;

public class BookingManager {
	 private static BookingManager instance = null;
	    private ArrayList<Booking> bookings = new ArrayList<>();

	    private BookingManager() {}

	    public static BookingManager getInstance() {
	        if (instance == null) {
	            instance = new BookingManager();
	        }
	        return instance;
	    }

	    public void addBooking(Booking booking) {
	        bookings.add(booking);
	    }

	    public boolean isBooked(String venueName, String date) {
	        for (Booking b : bookings) {
	            if (b.getVenue().name.equalsIgnoreCase(venueName) && b.getDate().equals(date)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public int getBookingCount() {
	        return bookings.size();
	    }

	    public void cancelBooking(String venueName, String date) {
	        for (int i = 0; i < bookings.size(); i++) {
	            Booking b = bookings.get(i);
	            if (b.getVenue().name.equalsIgnoreCase(venueName) && b.getDate().equals(date)) {
	                bookings.remove(i);
	                System.out.println("\n[CANCEL SUCCESS] Booking " + b.getBookingId() + " cancelled successfully.");
	                return;
	            }
	        }
	        System.out.println("[INFO] No booking found to cancel.");
	    }
}
