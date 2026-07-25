package com.For_Loops;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter a target integer: ");
        num = scanner.nextInt();

        for (int i = 1; i <=  10; i++){
            int multiplication = num * i;
            System.out.printf("%d x %d = %d\n", num, i, multiplication);
        }

        scanner.close();
    }
}
