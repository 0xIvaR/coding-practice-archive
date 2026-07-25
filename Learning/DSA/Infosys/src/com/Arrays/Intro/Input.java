package com.Arrays.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //array of primitive
//        int[] arr = new int[3];
//
//        arr[0] = 1;
//        arr[1] = 5;
//        arr[2] = 6;
//
//        System.out.println(arr[2]);
//
//        // input using for loops
//        int[] arr1 = new int[5];
//
//        for (int i = 0; i< arr1.length; i++){
//            arr1[i] = scanner.nextInt();
//        }
//
//        for (int num : arr1){
//            System.out.println(num + " ");
//        }
//
//        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str= new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = scanner.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[2] = "hello";
        System.out.println(Arrays.toString(str));
    }
}
