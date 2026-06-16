package com.Input;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        // Exercise 2: The Ticket Booking Receipt**
        //
        //Task: Create a program that prompts a user for three things:
        //    1. The destination name (String sentence, e.g., `"Berlin Grand Station"`).
        //    2. The number of tickets they want to buy (`int`).
        //    3. The base price of a single ticket (`double`).
        //- Output a formatted invoice showing the destination and the total calculated cost.
        //- *Hint:* Watch out for the input buffer trap when transitioning between numbers and sentences!

        Scanner receipt = new Scanner(System.in);

        System.out.print("Enter your destination: ");
        String station = receipt.nextLine();

        System.out.print("Enter the number of tickets: ");
        int ticket = receipt.nextInt();

        System.out.print("Enter the price of the ticket: ");
        double price = receipt.nextDouble();

        double amount = ticket * price;

        System.out.println("****************");
        System.out.println("Invoice");
        System.out.println("****************");

        System.out.println("Destination: " + station);
        System.out.println("No of tickets: " + ticket);
        System.out.println("Total amount: " + amount);


    }
}
