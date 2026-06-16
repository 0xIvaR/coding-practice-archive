package com.Input;
import java.util.Scanner;

public class Q_2 {
    public static void main (String[] arg){

        //Task: Write a program that asks the user to input two decimal numbers (double), calculates their sum, difference, and product, and prints the results back out to the console.

        Scanner user = new Scanner(System.in);

        double firstNum = 0;
        double secondNum = 0;

        System.out.print("Enter first number: ");
        firstNum = user.nextDouble();

        System.out.print("Enter second number: ");
        secondNum = user.nextDouble();

        double sum = firstNum + secondNum;
        double difference = firstNum - secondNum;
        double product = firstNum * secondNum;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

    }
}
