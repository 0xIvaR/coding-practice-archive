package com.Patterns.Normal_Patterns;

import java.util.Scanner;

public class Pattern_1 {
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
            for (int j = 1; j <= column; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
