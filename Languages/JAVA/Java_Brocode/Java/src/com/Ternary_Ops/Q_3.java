package com.Ternary_Ops;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Enter number 1: ");
        num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        num3 = scanner.nextInt();

        //int maxValue = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;

        int maxValue = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("The maximum value is: " + maxValue);

        scanner.close();
    }
}
