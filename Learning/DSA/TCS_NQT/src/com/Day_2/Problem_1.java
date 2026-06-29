package com.Day_2;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int z = 0; z < q; z++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int currentSum = a;

            for (int i = 0; i < n; i++){
                int num = (1 << i )* b;
                currentSum += num;
                System.out.print(currentSum + " ");
            }
            System.out.println();
        }
    }
}
