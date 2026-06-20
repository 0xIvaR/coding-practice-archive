package com.Ternary_Ops;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double baseFair = 50.00;
        int hour;

        System.out.print("Enter current hour (0-23): ");
        hour = scanner.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Error: Invalid military time structure! Try again.");
        } else {
            double ticketCost = (hour >= 16 && hour <= 19) ? (baseFair + 25.00) : baseFair;
            System.out.printf("Final Ticket Cost: $%.2f\n", ticketCost);
        }

    }
}
