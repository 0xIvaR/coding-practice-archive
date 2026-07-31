package com.T25_Nested_Loops;

public class Q_1 {
    public static void main(String[] args) {

        // Outer loop tracks the vertical axis (rows) from 1 up to 3
        for (int x = 1; x <= 3; x++) {

            // Inner loop tracks the horizontal axis (columns) from 1 up to 3
            for (int y = 1; y <= 3; y++) {
                // print() keeps all coordinates for the current row on the same line
                System.out.print("(" + x + "," + y + ") ");
            }

            // This blank println() fires ONLY after the inner loop finishes a row,
            // dropping the cursor down to start the next row cleanly.
            System.out.println();
        }
    }
}
