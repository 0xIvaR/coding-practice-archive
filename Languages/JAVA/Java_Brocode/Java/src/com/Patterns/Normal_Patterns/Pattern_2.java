package com.Patterns.Normal_Patterns;

public class Pattern_2 {
    public static void main(String[] args) {
        // ========= HOLLOW RECTANGLE =========

/*
        //========= OUTPUT =========

        *******
        *     *
        *     *
        *     *
        *     *
        *******
 */

        int row = 6;
        int column = 7;

        // Outer loop handles moving down row by row
        for (int i = 1; i <= row; i++) {

            // Inner loop handles moving across columns from scratch for the current row
            for (int j = 1; j <= column; j++) {

                // 1. Check your 4 border conditions here!
                // 2. Print either "*" or " "
                // Combining all 4 walls into a single check
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // Once a whole row finishes printing its columns, hit enter for the next line
            System.out.println();
        }
    }
}

