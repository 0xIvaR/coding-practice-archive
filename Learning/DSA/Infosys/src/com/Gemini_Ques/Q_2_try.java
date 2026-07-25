package com.Gemini_Ques;

import java.util.Arrays;
import java.util.Scanner;

public class Q_2_try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }

        int left = 0;
        int right = N -1;
        int maxVolume = 0;

        while(left < right){
            int width = right - left;

            int currentHeight = Math.min(arr[left], arr[right]);

            int currentVolume = width * currentHeight;

            maxVolume = Math.max(maxVolume, currentVolume);

            if (arr[left] < arr[right]){
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxVolume);
        scanner.close();
    }
}
