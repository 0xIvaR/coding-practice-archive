package com.Patterns.Normal_Patterns;

public class Pattern_7 {
    public static void main(String[] args) {
        // ========= Inverted Half Pyramid =========
/*
        // ========= OUTPUT =========

            *****
            ****
            ***
            **
            *

 */
        int num = 5;

        // outer loop
        for(int i= 1; i <= num; i++){
            // inner loop
            for (int j = 1; j <= num-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
