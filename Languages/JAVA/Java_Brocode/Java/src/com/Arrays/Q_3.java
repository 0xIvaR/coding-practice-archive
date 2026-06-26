package com.Arrays;

public class Q_3 {
    public static void main(String[] args) {
        String[] databaseTokens = {"Token_A", "Token_B", "Token_C", "Token_D"};

        // =========== Helper Array Method ===========

        // 1. Create a brand-new helper array structure of the same size
        String[] helperArray = new String[databaseTokens.length];

        // 2. Simple loop tracking: i goes forward, j goes backward
        int j = databaseTokens.length - 1;
        for (int i = 0; i < databaseTokens.length; i++) {
            helperArray[j] = databaseTokens[i]; // Just copy it over!
            j--;
        }

        // =========== Without Helper Array Method ===========  

//        int midPoint = databaseTokens.length/2;
//        for (int i = 0; i < midPoint; i++) {
//
//            // 1. Fill the temporary glass with the value at the current index (i)
//            String temp = databaseTokens[i];
//
//            // 2. Find the opposite index position on the right side of the array
//            int oppositeIndex = databaseTokens.length - 1 - i;
//
//            // 3. Copy the value from the right side into the left side
//            databaseTokens[i] = databaseTokens[oppositeIndex];
//
//            // 4. Put the saved value from the temporary glass into the right side
//            databaseTokens[oppositeIndex] = temp;
//        }

        // =========== Helper Array Method ===========
        System.out.println("--- Inverting Array Tokens (Helper Method) ---");
        for (int i = 0; i < helperArray.length; i++) {
            System.out.printf("Slot [%d]: %s\n", i, helperArray[i]);

        // =========== Without Helper Array Method ===========
//        System.out.println("--- Inverting Array Tokens ---");
//        for (int i = 0; i < databaseTokens.length; i++) {
//            System.out.printf("Slot [%d]: %s\n", i, databaseTokens[i]);
        }
    }
}
