package com.T32_User_Input_Array;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] prices;
        double sum = 0;

        System.out.print("Enter the number of items in the cart: ");
        int cartLength = scanner.nextInt();

        if (cartLength > 0) {
            prices = new double[cartLength];

            for (int i = 0; i < cartLength; i++){
                do {
                    System.out.printf("Enter price for item %d: ", i + 1);
                    prices[i] = scanner.nextDouble();

                    if (prices[i] < 0) {
                        System.out.println("Invalid amount; try again.");
                    }
                } while (prices[i] < 0);
            }

            for (double price : prices){
                sum += price;
            }

            System.out.println();
            System.out.println("Calculating total bill...");
            System.out.println("Standard 5% discount applied.");
            System.out.println();

            System.out.printf("Final Checkout Price: $%.2f", (sum * 0.95));
        } else {
            System.out.println("Enter valid number!");
        }

        scanner.close();
    }
}