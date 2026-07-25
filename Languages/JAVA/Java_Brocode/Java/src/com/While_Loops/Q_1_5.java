package com.While_Loops;

import java.util.Scanner;

public class Q_1_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter a number greater than 0: ");
            num = scanner.nextInt();
        } while (num <= 0);

        System.out.println("Valid input captured: " + num);

        scanner.close();
    }
}
