package com.Logical_Ops;

import java.util.Scanner;

public class UsernameProb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        //username must not contain spaces or underscores

        String userName;

        System.out.print("Enter your username: ");
        userName = scanner.nextLine();

        if (userName.length() < 4 || userName.length() > 12) {
            System.out.println("Username must be in 4 to 12 characters.");
        } else if (userName.contains(" ") || userName.contains("_")) {
            System.out.println("Username must not contains a space or underscore");
        } else {
            System.out.printf("Username is : %s", userName);
        }

        scanner.close();
    }
}
