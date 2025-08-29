package com.bookingapp.model;

public class Booking {
	public String bookingId;
    private Venue venue;
    private User user;
    private String date;
    private double finalPrice;

    public Booking(String bookingId, Venue venue, User user, String date) {
        this.bookingId = bookingId;
        this.venue = venue;
        this.user = user;
        this.date = date;
        this.finalPrice = venue.calculateFinalPrice(date);
    }

    public Venue getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

    public String getBookingId() {
        return bookingId;
    }

    @Override
    public String toString() {
        return "\n[BOOKING SUCCESS]\n" +
               "   Booking ID: " + bookingId + "\n" +
               "   Venue: " + venue.name + "\n" +
               "   Date: " + date + "\n" +
               "   Final Price: ₹" + String.format("%,.0f", finalPrice);
    }

}
