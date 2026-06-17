package com.IfStatement;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {

        //Exercise 2: Time-of-Day Greeter (Military Clock)
        //Task: Create a system that captures a whole number integer representing the hour of the day on a 24-hour military clock (e.g., 13 for 1 PM, 21 for 9 PM). Print a greeting based on these parameters:
        //
        //Hour between 0 and 11: Print "Good Morning"
        //
        //Hour between 12 and 16: Print "Good Afternoon"
        //
        //Hour between 17 and 23: Print "Good Evening"
        //
        //Any other number: Print "Invalid military time structure"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time: ");
        int time = scanner.nextInt();

        if (time >= 0 && time <= 11){
            System.out.println("Good Morning");
        } else if (time >=  12 && time <= 16) {
            System.out.println("Good Afternoon");
        } else if (time >= 17 && time <= 23) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Invalid military time structure");
        }

        scanner.close();
    }
}
