package com.While_Loops;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        int inputNum, secretPin, attemptCounter;
        secretPin = 7382;
        attemptCounter = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the 4-digit secret key: ");
            inputNum = input.nextInt();
            String numberLength = Integer.toString(inputNum);

            if (numberLength.length() != 4) {
                System.out.println("Enter valid pin!");
                continue;
            }

            attemptCounter ++;

            if (inputNum == secretPin) {
                break;
            }

            System.out.println("Incorrect PIN! Try again.");
        }

        System.out.printf("Access Granted! You unlocked the vault in %d attempts.", attemptCounter);

        input.close();
    }
}
