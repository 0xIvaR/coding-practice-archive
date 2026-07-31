package com.Lecture_2_Func_Methods.Methods;

import java.util.Scanner;

public class Methods_1 {
    public static void main(String[] args) {
        sum();
    }

   static void sum () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum = " + sum);

        scanner.close();
    }
}
