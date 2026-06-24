package com.Array_EnterUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Establish the structural capacity threshold [05:13:45]
        System.out.print("Enter total registry size capacity: ");
        int dynamicSize = scanner.nextInt();

        // Step 2: Allocate the array housing shell [05:14:05]
        String[] taskRegistry = new String[dynamicSize];

        // CRITICAL: Flush the trailing enter-key buffer artifact away!
        scanner.nextLine();

        System.out.println("\n--- Launching Sequential Ingestion Stream ---");

        // Step 3: Loop through slots to capture live string data payloads [05:14:30]
        for (int i = 0; i < taskRegistry.length; i++) {
            System.out.print("Populate Item Slot [" + i + "]: ");
            taskRegistry[i] = scanner.nextLine().trim(); // Insert directly into index slot
        }

        System.out.println("\n--- Final Registry Invoice Overview ---");

        // Step 4: Output the compiled array back to the user
        for (int i = 0; i < taskRegistry.length; i++) {
            System.out.println("Registered Cell Tracker [" + i + "] -> " + taskRegistry[i]);
        }

        scanner.close();
    }
}