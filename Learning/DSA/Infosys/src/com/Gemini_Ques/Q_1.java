package com.Gemini_Ques;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Portion 1: Reading Inputs
        int n = sc.nextInt();
        long currentExp = sc.nextLong(); // Tracked as long to prevent overflow

        int[][] monsters = new int[n][2];

        // Populate the Power values into column 0
        for (int i = 0; i < n; i++) {
            monsters[i][0] = sc.nextInt();
        }

        // Populate the Bonus values into column 1
        for (int i = 0; i < n; i++) {
            monsters[i][1] = sc.nextInt();
        }

        // Portion 2: Glued Sorting Strategy
        // Sorts the 2D array by column 0 (Power) from lowest to highest
        Arrays.sort(monsters, (a, b) -> Integer.compare(a[0], b[0]));

        // Portion 3: The Combat Execution Engine
        int monstersDefeated = 0;

        for (int i = 0; i < n; i++) {
            int monsterPower = monsters[i][0];
            int monsterBonus = monsters[i][1];

            // Check if your experience is high enough to fight
            if (currentExp >= monsterPower) {
                currentExp += monsterBonus; // Experience permanently increases
                monstersDefeated++;         // Update our scoreboard
            } else {
                // Since the array is sorted, if you can't beat this monster,
                // you cannot beat any of the remaining ones. Stop immediately!
                break;
            }
        }

        // Output the final maximum count
        System.out.println(monstersDefeated);

        sc.close();
    }
}