package com.Patterns.Advanced_Patterns;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {

        // ========= SOLID RECTANGLE =========
/*
        // ========= OUTPUT =========

                    ****
                   ****
                  ****
                 ****
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        int column = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the symbol you want: ");
        char symbol = scanner.nextLine().charAt(0);

        for (int i = 1; i <= row; i++){

            // 👇 ADD THIS LOOP TO CREATE THE SHIFT
            // This prints spaces that decrease as 'i' increases
            for (int j = 1; j <= (row - i); j++){
                System.out.print(" ");
            }

            // Your original symbol loop stays exactly the same
            for (int j = 1; j <= column; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
