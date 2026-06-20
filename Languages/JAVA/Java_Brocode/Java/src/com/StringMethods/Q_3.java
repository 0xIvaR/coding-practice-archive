package com.StringMethods;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        //### **Exercise 3: Custom Email Integrity Slicer**
        //
        //- **Difficulty Level:** 🔴 **Hard**
        //- **Target Focus:** Complex index positioning calculation, data stream extraction, and syntax verification tracking.
        //- **The Instructions:**
        //    - 1. Prompt a user to input their academic email address string.
        //    - 2. First, verify the structural integrity of the input: if the string does not contain an `"@"` character, print `"Error: Invalid email structure."` and stop the program.
        //    - 3. If it contains an `"@"`, find its exact numeric index location using your string index hunting utilities.
        //    - 4. Slice the string into two brand-new independent variables: `username` (everything from index `0` up to the entry location of the `"@"`) and `domain` (everything from directly after the `"@"` until the absolute end of the string).
        //    - 5. Print out the extracted variables formatted neatly: `"User Frame: [username] | Server Gateway: [domain]"`.

        Scanner scanner = new Scanner(System.in);

        String email;
        System.out.print("Enter your academic email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            int atIndex = email.indexOf("@");
            int emailLength = email.length();
            System.out.println("User Frame: " + email.substring(0, atIndex) + " | Server Gateway: "+email.substring(atIndex+1, emailLength));
        } else {
            System.out.println("Error: Invalid email structure.");
        }

        scanner.close();

    }
}
