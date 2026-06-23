package com.Methods;

public class Main {

    // 1. The Main Method: This is the central control room where your program ALWAYS starts executing.
    public static void main(String[] args) {

        // --- CALLING A VOID METHOD ---
        // We pass the live data ("Soham") into the slot. This live data is called an ARGUMENT.
        triggerAlarm("Soham");


        // --- CALLING A VALUE-RETURNING METHOD ---
        // Because 'cubeNumber' returns an integer back to us, we must capture it in a variable!
        int savedResult = cubeNumber(5);

        System.out.println("The control room received the calculated cube: " + savedResult);
    }

    // 2. OUR FIRST CUSTOM METHOD (Void Type)
    // It has an input slot for a String. It returns NOTHING (void), it just prints to the terminal.
    public static void triggerAlarm(String developerName) {
        System.out.println("⚠️ WARNING: Code execution intercepted by " + developerName);
        System.out.println("Executing local method system protocols...");
    }

    // 3. OUR SECOND CUSTOM METHOD (Value-Returning Type)
    // It has an input slot for an integer. It promises to return an 'int' back to the control room.
    public static int cubeNumber(int baseNumber) {
        int product = baseNumber * baseNumber * baseNumber;

        return product; // 👑 The 'return' keyword pushes the payload out of the box and stops the method!
    }
}