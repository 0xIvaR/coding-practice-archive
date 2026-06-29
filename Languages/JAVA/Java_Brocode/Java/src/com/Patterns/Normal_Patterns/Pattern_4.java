package com.Patterns.Normal_Patterns;

public class Pattern_4 {
    public static void main(String[] args) {

        // ========= INVERTED HALF-PYRAMID 180 deg =======
/*
        // ========= OUTPUT =========

              *
             **
            ***
           ****
          *****

 */
        int stars = 5;

        for (int i = 1; i <= stars; i++){
            for (int j = 1; j <= stars - i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
