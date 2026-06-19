package com.Experiments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double ship;

        System.out.print("Enter num1: ");
        num1 = scanner.nextDouble();

        if (num1 >= 100) {
            ship = 0;
        } else {
            ship = 20;
        }

        System.out.println("======= SHIPPING INVOICE ==========");
        System.out.printf("Shipping fee: %.2f", ship);

        scanner.close();

    }
}
