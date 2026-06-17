package com.IfStatement;
import java.util.Scanner;

public class If_Statement {
    public static void main ( String [] arg) {

        // If-Statement = Perform a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Are you a Student (true/false): ");
        isStudent = scanner.hasNext();

        // GROUP 1: AGE
        if (age >= 65) {
            System.out.println("You are a Senior");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else {
            System.out.println("you are not an adult");
        }

        // GROUP 2: NAME
        if (name.isEmpty()) {
            System.out.println("You didn't entered your name");
        } else {
            System.out.println("Hello " + name + "!");
        }

        // GROUP 3: STUDENT OR NOT ?
        if (isStudent){
            System.out.println("You are a Student!");
        } else {
            System.out.println("You are not a Student!");
        }
    }
}