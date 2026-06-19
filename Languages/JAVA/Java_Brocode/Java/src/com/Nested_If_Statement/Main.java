package com.Nested_If_Statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double ticketPrice;

        System.out.print("Are you a Student? : ");
        isStudent = scanner.nextBoolean();
        System.out.print("Are you a Senior? : ");
        isSenior = scanner.nextBoolean();
        System.out.print("Enter ticket price: ");
        ticketPrice = scanner.nextDouble();


        if (isStudent) {
            if (isSenior) {
                System.out.println("You will get 10% + 20% = 30% discount Senior + Student");
                ticketPrice *= 0.7;
            } else {
                System.out.println("You will get 10% discount Student");
                ticketPrice *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You will get 20% discount");
                ticketPrice *= 0.8;
            } else {
                System.out.println("Actual price only");
            }
        }

        System.out.printf("Price:%.2f", ticketPrice);

        scanner.close();
    }
}
