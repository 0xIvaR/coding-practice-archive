package com.Enhanced_Switches;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        // Key Concepts Explained
        //Enhanced Switch Expression: Unlike traditional switch statements, a switch expression evaluates to a single value that can be directly assigned to a variable.
        //
        //Java
        //String message = switch (variable) {
        //    case VALUE -> "Result 1";
        //    default -> "Default Result";
        //}; // Note the semicolon at the end!
        //Arrow Syntax (->): The arrow replaces the colon (:) and eliminates the need for the break; keyword. Java automatically exits the switch block after executing the right side of the arrow.
        //
        //Case Grouping: You can handle multiple inputs that share the exact same outcome by separating them with commas within a single case (e.g., case X, Y -> ...).
        //
        //Case Insensitivity: The instructions mention accounting for lower-case entries. You can handle this either by including both uppercase and lowercase characters in your cases (e.g., 'A', 'a'), or by converting the user's input to a standard casing before it hits the switch.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your academic letter grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        // The enhanced switch expression directly assigns the string to the variable
        String feedback = switch (grade) {
            case 'A', 'B' -> "Excellent progress!";
            case 'C', 'D' -> "Passing marks, room to grow.";
            case 'F'      -> "Academic warning state.";
            default       -> "Enter valid grade!";
        }; // Semicolon is required here because it's an expression assignment

        // Now we print the final result using the variable
        System.out.println("Feedback: " + feedback);

        scanner.close();
    }
}