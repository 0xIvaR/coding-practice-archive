package com.Nested_Loops;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Symbol: ");
        String symbol = scanner.nextLine();

        System.out.print("Enter Row: ");
        int row = scanner.nextInt();

        System.out.print("Enter Column: ");
        int col = scanner.nextInt();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
