package com.StringMethods;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        //### **Exercise 2: Secret Code-Word Validator**
        //
        //- **Difficulty Level:** 🟡 **Medium**
        //- **Target Focus:** Advanced content matching and boolean tracking.
        //- **The Instructions:**
        //    - 1. Hardcode a master system password string at the top of your program: `String masterCode = "JAVA_ARCADE_2026";`.
        //    - 2. Prompt the user to enter a matching security key phrase.
        //    - 3. Use an `if-else` statement to evaluate if the user's entry matches the `masterCode` exactly. You must use a method that ignores case errors (so `"java_arcade_2026"` still passes the gate).
        //    - 4. If it matches, print `"Access Authorized."`. If it fails, check if the password simply *contains* the word `"JAVA"` anywhere inside it. If it contains `"JAVA"`, print `"Hint: You have the right language but the wrong code matrix."`. Otherwise, print `"Access Denied."`.

        Scanner scanner = new Scanner(System.in);

        String mainPassword = "JAVA_ARCADE_2026";
        String password;

        System.out.print("Enter security key phrase: ");
        password = scanner.nextLine();

        if (password.equalsIgnoreCase(mainPassword)) {
            System.out.println("Access Authorized.");
        } else {
            if (password.contains("JAVA")) {
                System.out.println("Hint: You have the right language but the wrong code matrix.");
                System.out.print("Try again");
            } else {
                System.out.println("Access Denied.");
            }
        }


        scanner.close();
    }
}
