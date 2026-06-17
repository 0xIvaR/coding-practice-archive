package com.RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class Q_1 {
    public static void main (String [] arg) {

        // ### **Exercise 1: Unpredictable Math Quiz**
        //
        //- **Task:** Create a program that automatically generates two random integers between `1` and `20`. Display a question to the user asking them to add the two numbers together (e.g., `"What is 12 + 7?"`). Use a `Scanner` to capture their answer and an `if-else` statement to tell them if they got it right or wrong.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum1;
        int randomNum2;
        int answer;

        randomNum1 = random.nextInt(1, 21);
        randomNum2 = random.nextInt(1, 21);

        System.out.print("What is " + randomNum1 + "+" + randomNum2 + " ? : ");
        answer = scanner.nextInt();

        int condition = randomNum1 + randomNum2;

        if (answer == condition) {
            System.out.println("RIGHT ANSWER");
        } else {
            System.out.println("WRONG ANSWER");
        }

        scanner.close();
    }
}