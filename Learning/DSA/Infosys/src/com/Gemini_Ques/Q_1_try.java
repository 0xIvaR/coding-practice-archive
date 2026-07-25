package com.Gemini_Ques;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1_try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long CurrentExp = scanner.nextLong();

        int[][] monsters = new int[n][2];

        // 1st column
        for (int i = 0; i < n; i++) {
            monsters[i][0] = scanner.nextInt();
        }
        //2nd column
        for (int i = 0; i < n; i++) {
            monsters[i][1] = scanner.nextInt();
        }

        Arrays.sort(monsters, (a, b) -> Integer.compare(a[0], b[0]));

        // logic
        int count = 0;
        for (int i = 0; i < n; i++) {
            // monsters[i][0] is the current monster's power
            if (CurrentExp >= monsters[i][0]) {
                // Add the bonus (monsters[i][1]) to our experience
                CurrentExp += monsters[i][1];
                count++;
            } else {
                // Since it's sorted, if we can't beat this one, we can't beat any remaining ones
                break;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}