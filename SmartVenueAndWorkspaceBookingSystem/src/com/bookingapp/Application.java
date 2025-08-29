package com.bookingapp;

import java.util.Scanner;
import com.bookingapp.exception.AlreadyFound;
import com.bookingapp.factory.VenueFactory;
import com.bookingapp.manager.BookingManager;
import com.bookingapp.model.Booking;
import com.bookingapp.model.User;
import com.bookingapp.model.Venue;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user details dynamically
        System.out.print("Enter your User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();

        User user = new User(userId, userName, userEmail);

        // Step 2: Display entered user details
        System.out.println("\n--- User Details ---");
        System.out.println("User ID   : " + user.getId());
        System.out.println("Name      : " + user.getName());
        System.out.println("Email     : " + user.getEmail());
        System.out.println("--------------------");

        BookingManager manager = BookingManager.getInstance();

        // Step 3: Initialize venues
        Venue[] venues = new Venue[3];
        venues[0] = VenueFactory.createVenue("FunctionHall",501, "Grand Palace", "Hyderabad", 50001, 500);
        venues[1] = VenueFactory.createVenue("Workspace", 502, "CoWork Hub", "Bangalore", 49999, 200);
        venues[2] = VenueFactory.createVenue("ToLet",503, "TechPark Office", "Chennai", 54999, 450);

        // Step 4: Booking loop
        boolean continueBooking = true;

        while (continueBooking) {
            System.out.println("\nAvailable venues:");
            for (int i = 0; i < venues.length; i++) {
                System.out.println((i + 1) + ". " + venues[i].getName() + " in " + venues[i].getLocation());
            }

            System.out.print("Select a venue by number: ");
            int choice = scanner.nextInt();

            System.out.print("Enter booking date (YYYY-MM-DD): ");
            String date = scanner.next();

            try {
                Booking booking = user.bookVenue(venues[choice - 1], date);
                System.out.println("\nBooking successful: " + booking);
            } catch (AlreadyFound e) {
                System.out.println("\n[ERROR] AlreadyBookedException: " + e.getMessage());
            }

            System.out.print("\nDo you want to book another venue? (yes/no): ");
            scanner.nextLine(); // consume leftover newline
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueBooking = false;
            }
        }

        // Step 5: Optional cancellation
        System.out.print("\nEnter venue name to cancel booking (or press enter to skip): ");
        String cancelName = scanner.nextLine();
        if (!cancelName.isEmpty()) {
            System.out.print("Enter booking date to cancel: ");
            String cancelDate = scanner.nextLine();
            manager.cancelBooking(cancelName, cancelDate);
        }

        scanner.close();
        System.out.println("\nThank you for using the booking system!");
    }
}