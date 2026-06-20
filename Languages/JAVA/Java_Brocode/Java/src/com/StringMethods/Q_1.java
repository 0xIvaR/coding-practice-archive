package com.StringMethods;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        //### **Exercise 1: Dynamic Username Formatter**
        //
        //- **Difficulty Level:** 🟢 **Easy**
        //- **Target Focus:** Text checking and basic string transformations.
        //- **The Instructions:** 1. Prompt the user to enter a new username using a `Scanner`.
        //2. Clean up the entry immediately by trimming off any accidental leading or trailing white spaces.
        //3. Transform the cleaned username to entirely lowercase letters to ensure uniformity.
        //4. Print the final cleaned username and display its exact character length count back to the console.

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter your username: ");
        name = scanner.nextLine();

        System.out.println("Cleaned Username: " + name.trim().toLowerCase());
        System.out.println("character: " + name.trim().length());

        scanner.close();
    }
}
