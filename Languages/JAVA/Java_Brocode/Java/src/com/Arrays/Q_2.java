package com.Arrays;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.print("How many prices do you want to register? : ");
        int userInputSize = scanner.nextInt();

        double[] itemPrices = new double[userInputSize];

        for (int i = 0; i < itemPrices.length; i++) {
            System.out.print("Enter price for item "+(i+1)+": ");
            itemPrices[i] = scanner.nextDouble();
        }

        for (double itemPrice : itemPrices) {
            sum += itemPrice;
        }
        System.out.println();
        System.out.printf("Total Price Sum: $%.2f\n", sum);
    }
}
