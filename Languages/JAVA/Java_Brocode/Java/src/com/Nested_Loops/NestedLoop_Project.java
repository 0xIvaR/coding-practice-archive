package com.Nested_Loops;

import java.util.Scanner;

public class NestedLoop_Project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int row;
        int column;
        char symbol;

        System.out.print("Enter the # of rows: ");
        row = scanner.nextInt();
        System.out.print("Enter the # of rows: ");
        column = scanner.nextInt();
        System.out.print("Enter the symbol you want to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
