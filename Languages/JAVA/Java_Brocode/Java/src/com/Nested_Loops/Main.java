package com.Nested_Loops;

public class Main {
    public static void main(String[] args) {

        // nested loop = a loop inside another loop
        //                 uses it often with metrics or DSA

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
