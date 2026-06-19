package com.Nested_If_Statement;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        // ### **Exercise 2: Automated ATM Cash Withdrawal Portal**
        //
        //- **Difficulty Level:** 🟡 **Medium**
        //- **Target Focus:** Dependent transactional state checking and balance mutations.
        //- **The Instructions:**
        //    1. Initialize a starting double variable: `double accountBalance = 1000.00;`.
        //    2. Prompt the user to enter their secret security PIN (`int`).
        //    3. If the PIN is **not equal to `5555`**, print `"Invalid Pin. Transaction Terminated."`.
        //    4. If the PIN **is equal to `5555`**, enter the nested block and prompt the user to input a cash withdrawal amount (`double`).
        //    5. Check the amount: If the requested cash is **less than or equal to** the `accountBalance`, deduct the money and print the remaining layout: `"Success! New balance: $X"`.
        //    6. If the requested cash **exceeds** the `accountBalance`, block the math step and print: `"Error: Insufficient funds."`.

        Scanner scanner = new Scanner(System.in);

        double mainBalance = 1000;
        int pin;
        double withdrawal;


        System.out.print("ENTER PIN: ");
        pin = scanner.nextInt();

        if (pin == 5555) {
            System.out.print("Enter withdrawal amount: ");
            withdrawal = scanner.nextDouble();
            if (mainBalance >= withdrawal) {
                mainBalance -= withdrawal;
                System.out.printf("Success! New balance:$%.2f\n", mainBalance);
            } else {
                System.out.println("Error: Insufficient funds.");
            }
        } else {
            System.out.println("Invalid Pin. Transaction Terminated.");
        }

        System.out.println("\n");
        System.out.printf("Current Balance:$%.2f", mainBalance);
        scanner.close();
    }
}
