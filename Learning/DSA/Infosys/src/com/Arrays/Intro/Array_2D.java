package com.Arrays.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int [][] arr = new int[3][];

//        int [][] arr2D = {
//            {1, 2, 3},
//            {4, 5 ,6},
//            {7, 8, 9}
//        };
//        System.out.println(arr2D[2][1]);

        //input
        int [][] arr = new int[3][3];
        //System.out.println(arr.length); // no of rows

        for (int row=0; row<arr.length; row++){
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = scanner.nextInt();
            }
        }
        System.out.println(arr[2][1]);
        System.out.println("==============");
        System.out.println(Arrays.toString(arr[1]));
        System.out.println("==============");
        // output
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("==============");
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}