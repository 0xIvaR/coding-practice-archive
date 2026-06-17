package com.Arithmetic_Ops;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        //Exercise 1: Even or Odd Checker (Modulus Integration)
        //Task: Prompt a user to enter any whole number integer using a Scanner. Use the modulus operator % to determine if the number is even or odd. Print out a confirmation statement.
        //
        //Hint: If a number is perfectly divisible by 2, what must its remainder equal?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean isEven = (num % 2 == 0);

        if (isEven){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
