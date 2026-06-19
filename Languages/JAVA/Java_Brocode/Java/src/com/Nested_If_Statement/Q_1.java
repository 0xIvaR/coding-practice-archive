package com.Nested_If_Statement;

import java.util.Objects;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        // ### **Exercise 1: System Security Clearance Gate**
        //
        //- **Difficulty Level:** 🟢 **Easy**
        //- **Target Focus:** Single-nested structural routing and simple input validation.
        //- **The Instructions:** 1. Prompt the user to enter a 4-digit passcode integer.
        //2. If the passcode **does not equal `1234`**, print `"SYSTEM BLOCK: Unauthorized access."` and end the program.
        //3. If the passcode **equals `1234`**, print `"Access Granted."` and unlock the nested gate. Inside this block, prompt the user to input their role (`"Admin"` or `"User"`).
        //4. If the role equals `"Admin"`, print `"Full Root clearance active."`. Otherwise, print `"Standard User profile active."`.

        Scanner scanner = new Scanner(System.in);

        int passcode;
        String role;


        System.out.print("Enter passcode: ");
        passcode = scanner.nextInt();
        scanner.nextLine();

        // MAIN - Nested Conditions (Decision Trees)
        if (passcode == 1234) {
            System.out.println("Access Granted.");
            System.out.print("Enter your role: ");
            role = scanner.nextLine();
            if (Objects.equals(role, "Admin")) {
                System.out.println("Full Root clearance active.");
            } else if (Objects.equals(role, "User")) {
                System.out.println("Standard User profile active.");
            } else {
                System.out.println("Enter a valid role!");
            }
        } else {
            System.out.println("SYSTEM BLOCK: Unauthorized access.");
        }

        scanner.close();
    }
}
