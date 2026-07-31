package com.T21_While_Loops;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        double sumTotal = 0.00;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter a number (negative number to stop): ");
            double number = scanner.nextDouble();

            if (number < 0) {
                break;
            }

            sumTotal += number;
        }

        System.out.printf("Final Sum Total: %.2f\n", sumTotal);
    }
}

