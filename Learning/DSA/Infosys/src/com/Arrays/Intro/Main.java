package com.Arrays.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array size you want: ");
        int arraySize = scanner.nextInt();

        int[] num = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.print("Enter the number: ");
            num[i] = scanner.nextInt();
        }

        for (int numbers : num){
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(num));
    }
}
