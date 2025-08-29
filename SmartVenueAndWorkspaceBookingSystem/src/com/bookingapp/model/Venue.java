package com.bookingapp.model;

public abstract class Venue implements Bookable {
	int id;
    public String name;
    String location;
    double price;
    int capacity;

    public Venue(int id, String name, String location, double price, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.capacity = capacity;
    }

    public abstract double calculateFinalPrice(String date);

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return name + " | " + getType() + " | ₹" + String.format("%,.0f", price) + "/day | Capacity: " + capacity;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	 

}
