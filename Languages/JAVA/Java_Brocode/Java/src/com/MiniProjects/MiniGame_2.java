package com.MiniProjects;

import java.util.Scanner;

public class MiniGame_2 {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like: ");
        int quantity = scanner.nextInt();

        double total = (double) quantity * price ;

        System.out.println("\nYou have bought "+ quantity + " " + item + "/s");
        System.out.println("Your total is $" + total);
        scanner.close();
    }
}
