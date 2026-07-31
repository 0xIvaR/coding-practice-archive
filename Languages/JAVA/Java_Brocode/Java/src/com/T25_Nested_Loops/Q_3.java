package com.T25_Nested_Loops;

public class Q_3 {
    public static void main(String[] args) {

        // Outer loop tracks the rows (from 1 up to and including 5)
        for (int row = 1; row <= 5; row++) {

            // Inner loop tracks the columns (from 1 up to and including 5)
            for (int col = 1; col <= 5; col++) {
                // Calculate the mathematical product on the fly
                int product = row * col;

                // %4d reserves 4 characters of width for the number,
                // pushing it to the right so everything aligns perfectly.
                System.out.printf("%4d", product);
            }

            // Once an entire row of multiplications is done, drop down to the next line
            System.out.println();
        }
    }
}
