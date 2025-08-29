**Venue Booking System**
A Java-based application for managing venue bookings with support for multiple venue types and user-friendly interactions.

Features
User Management: Create and manage user profiles with ID, name, and email

Venue System: Three types of venues supported:
Function Halls

Workspaces

To-Let spaces

Booking Management: Book and cancel venue reservations

Exception Handling: Proper error handling for already booked venues

Interactive Console Interface: User-friendly command-line interface

**Prerequisites**
Java JDK 8 or higher

**Project Structure**
com.bookingapp/
├── exception/
│   └── AlreadyFound.java
├── factory/
│   └── VenueFactory.java
├── manager/
│   └── BookingManager.java
├── model/
│   ├── Booking.java
│   ├── User.java
│   └── Venue.java
└── Application.java

**Usage**
Start the application and enter your user details when prompted

View available venues presented in the list

Select a venue by entering the corresponding number

Choose a date in YYYY-MM-DD format for your booking

Confirm or cancel bookings as needed

Option to cancel existing bookings by providing venue name and date

**Example Session**
Enter your User ID: 101
Enter your name: John Doe
Enter your email: john@example.com

--- User Details ---
User ID   : 101
Name      : John Doe
Email     : john@example.com
--------------------

Available venues:
1. Grand Palace in Hyderabad
2. CoWork Hub in Bangalore
3. TechPark Office in Chennai

Select a venue by number: 1
Enter booking date (YYYY-MM-DD): 2024-01-15

Booking successful: [Booking details]

Do you want to book another venue? (yes/no): no

Enter venue name to cancel booking (or press enter to skip): Grand Palace
Enter booking date to cancel: 2024-01-15

Thank you for using the booking system!

**Error Handling**
The application includes exception handling for:

AlreadyFoundException: Prevents double-booking of the same venue on the same date

Input validation: Ensures proper data format for dates and numeric inputs

**Design Patterns Used**
Factory Pattern: VenueFactory creates different types of venues

**Singleton Pattern:** BookingManager ensures only one instance manages bookings

**Exception Handling:** Custom exceptions for specific error scenarios
