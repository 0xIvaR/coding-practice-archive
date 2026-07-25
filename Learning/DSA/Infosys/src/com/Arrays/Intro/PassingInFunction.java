package com.Arrays.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[4];

        for (int i = 0; i<4; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        func(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void func(int[] arr){
        arr[0] = 99;
    }
}
