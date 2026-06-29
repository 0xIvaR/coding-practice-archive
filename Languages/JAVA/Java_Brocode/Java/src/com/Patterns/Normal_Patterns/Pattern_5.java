package com.Patterns.Normal_Patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        // ========= HALF-PYRAMID WITH NUMBER =========
/*
        // ========= OUTPUT =========

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

 */
        int num = 5;

        //outer loop
        for (int i=1; i<=num; i++){
            //inner loop
            for (int j=1; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
