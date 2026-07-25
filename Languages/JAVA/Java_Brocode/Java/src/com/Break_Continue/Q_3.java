package com.Break_Continue;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cartValue;
        double cartTotal = 0.00;

        while (true){
            System.out.print("Enter item cost: ");
            cartValue = scanner.nextDouble();

            if (cartValue <= 0){
                System.out.println("Invalid item amount skipped.");
                continue;
            }

            cartTotal += cartValue;

            if (cartTotal >= 500){
                System.out.println("Cart limit ceiling reached.");
                System.out.printf("Final Invoice Receipt %.2f", cartTotal);
                break;
            }

        }

    }
}
