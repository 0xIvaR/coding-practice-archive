package com.T33_Search_An_Array;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cargoShipment = {"Apples", "Oranges", "Apples", "Bananas", "Apples", "Grapes"};

        // This flag will control our input verification loop
        boolean isValidInput = false;
        String target = "";
        int frequencyCount = 0;

        // The loop will repeat as long as the input remains invalid
        while (!isValidInput) {
            System.out.print("Enter a cargo keyword to audit: ");
            target = scanner.nextLine();

            System.out.println("\nCommencing full inventory scan...");
            frequencyCount = 0; // Reset counter for this attempt

            for (int i = 0; i < cargoShipment.length; i++) {
                if (target.equalsIgnoreCase(cargoShipment[i])) {
                    System.out.printf("[Match Found] '%s' logged at cargo slot index: %d\n", cargoShipment[i], i);
                    frequencyCount++;
                }
            }

            // Verification Check: If count is greater than 0, the item exists!
            if (frequencyCount > 0) {
                isValidInput = true; // This breaks the while loop execution
            } else {
                System.out.printf("⚠️ ERROR: '%s' not found in cargo shipment. Try again.\n\n", target);
            }
        }

        // Print the final summary report once valid data is secured
        System.out.println();
        System.out.printf("""
                =====================================
                        INVENTORY AUDIT REPORT      
                =====================================
                Total frequency count for '%s': %d
                =====================================""", target, frequencyCount);

        scanner.close();
    }
}