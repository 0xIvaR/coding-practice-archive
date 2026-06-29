package com.Patterns.Normal_Patterns;

public class Pattern_3 {
    public static void main(String[] args) {

        // ========= HALF-PYRAMID =========
/*
        // ========= OUTPUT =========

        *
        **
        ***
        ****

 */
        int stars = 4;

        for (int i = 1; i <= stars; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
