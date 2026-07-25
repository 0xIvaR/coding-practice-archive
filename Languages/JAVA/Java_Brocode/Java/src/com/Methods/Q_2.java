package com.Methods;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to cube: ");
        int userInput = scanner.nextInt();

        int calculatedResult = calculateCube(userInput);
        System.out.println("The cube of " + userInput + " is: " + calculatedResult);

        scanner.close();
    }
    public static int calculateCube (int baseNumber){
        int cube = baseNumber * baseNumber * baseNumber;
        return cube;
    }
}