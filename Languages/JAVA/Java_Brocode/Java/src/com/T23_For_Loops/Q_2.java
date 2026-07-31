package com.T23_For_Loops;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int baseValue, expoValue;
        long result = 1;

        System.out.print("Enter the base value: ");
        baseValue = scanner.nextInt();

        System.out.print("Enter the exponent value: ");
        expoValue = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < expoValue; i++){
            result *= baseValue;
        }
        System.out.println("Result Total: " + result);

        scanner.close();
    }
}

