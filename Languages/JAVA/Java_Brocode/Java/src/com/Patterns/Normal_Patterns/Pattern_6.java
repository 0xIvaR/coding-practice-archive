package com.Patterns.Normal_Patterns;

public class Pattern_6 {
    public static void main(String[] args) {
        // ========= Inverted Half Pyramid with Numbers =========
/*
        // ========= OUTPUT =========

        12345
        1234
        123
        12
        1

 */
        int n = 5;
        // outer loop
        for (int i =1; i <= n; i++){
            //inner loop
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
