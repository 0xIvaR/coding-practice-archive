package com.InputOps;

import java.util.Scanner;

public class Input_2 {
    public static void main(String[] args) {
        Scanner inputInteger = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int roll = inputInteger.nextInt();
        System.out.println("Yours roll no is: " + roll);

        Scanner inputString = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = inputString.nextLine();
        System.out.println("Your name is: " + name);

        Scanner inputFloat = new Scanner(System.in);
        System.out.print("Please enter the CGPA: ");
        float CGPA = inputFloat.nextFloat();
        System.out.println("your CGPA is: " + CGPA);

    }
}
