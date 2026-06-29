package com.Patterns.Advanced_Patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        int num = 4;

        // UPPER HALF
        for (int i = 1; i <= num; i++) {
            // 1st part (Left Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces (Dynamic: decreases as i grows)
            int spaces = 2 * (num - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part (Right Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER HALF
        for (int i = num; i >= 1; i--) { // Fixed: starts at num, goes down to 1
            // 1st part (Left Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces (Dynamic: increases as i shrinks)
            int spaces = 2 * (num - i); // Fixed: uses i so spaces change per row
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part (Right Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

