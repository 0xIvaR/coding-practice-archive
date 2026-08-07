package com.T32_User_Input_Array;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] registerId;

        System.out.print("Enter the number of corporate IDs to register: ");
        int numId = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer newline character

        if (numId > 0){
            registerId = new String[numId];

            for (int i = 0; i < numId ; i++){
                // Dynamically prompt for the current active index slot
                System.out.printf("Enter employee ID for slot %d: ", i);
                String input = scanner.nextLine();

                // Rule 1: Length Validation Check
                if (input.length() < 4) {
                    System.out.println("⚠️ SECURE ID ERROR: ID must be at least 4 characters long. Try again.");
                    i--; // Decrement index counter to force a re-entry for this exact slot
                }
                // Rule 2: Alphanumeric Anchor Validation Check
                else if (!input.matches(".*[a-zA-Z0-9].*")) {
                    System.out.println("⚠️ SECURE ID ERROR: ID requires alphanumeric anchor characters. Try again.");
                    i--; // Decrement index counter to force a re-entry for this exact slot
                }
                // Rule 3: Registration Success Action
                else {
                    registerId[i] = input;
                    System.out.println("Success! Saved to registry.");
                }
            }

            // Print the final filtered registry matrix block beautifully
            System.out.println("\n=====================================");
            System.out.println("    SECURE CORPORATE ID REGISTRY     ");
            System.out.println("=====================================");
            for (int i = 0; i < registerId.length; i++) {
                System.out.printf("[Registry Index %d] -> ID: %s\n", i, registerId[i]);
            }
            System.out.println("=====================================");

        } else {
            System.out.println("Enter valid number!");
        }

        scanner.close();
    }
}