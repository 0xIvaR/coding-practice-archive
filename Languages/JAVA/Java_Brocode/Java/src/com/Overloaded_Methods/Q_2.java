package com.Overloaded_Methods;

import java.util.Scanner;

public class Q_2 {

    // --- VERSION 1: System Broadcast ---
    // Signature: sendAlert(String)
    public static void sendAlert(String message) {
        System.out.println("[SYSTEM BROADCAST]: " + message);
    }

    // --- VERSION 2: Repeated Alert ---
    // Signature: sendAlert(String, int)
    public static void sendAlert(String message, int severityLevel) {
        for (int i = 0; i < severityLevel; i++) {
            System.out.println(message);
        }
    }

    // --- VERSION 3: Technical Error Log ---
    // Signature: sendAlert(int, String)
    public static void sendAlert(int systemErrorCode, String message) {
        System.out.println("ALERT [Code " + systemErrorCode + "]: " + message);
    }

    // --- EXECUTION ENGINE ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Alert Type: (1) Broadcast (2) Severity (3) Technical");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the hidden newline trap from reading the integer

        if (choice == 1) {
            System.out.print("Enter broadcast message: ");
            String msg = scanner.nextLine();

            // Routes automatically to Version 1
            sendAlert(msg);

        } else if (choice == 2) {
            System.out.print("Enter warning message: ");
            String msg = scanner.nextLine();

            System.out.print("Enter severity level (repetitions): ");
            int severity = scanner.nextInt();

            // Routes automatically to Version 2 because layout is (String, int)
            sendAlert(msg, severity);

        } else if (choice == 3) {
            System.out.print("Enter system error code: ");
            int code = scanner.nextInt();
            scanner.nextLine(); // Clear the hidden newline trap before reading string

            System.out.print("Enter error description: ");
            String msg = scanner.nextLine();

            // Routes automatically to Version 3 because layout is (int, String)
            sendAlert(code, msg);

        } else {
            System.out.println("Invalid Selection!");
        }

        scanner.close();
    }
}