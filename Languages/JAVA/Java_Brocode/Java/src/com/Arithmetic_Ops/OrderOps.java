package com.Arithmetic_Ops;

public class OrderOps {
    public static void main(String[] args) {

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // P = () | E = Math.pow/.sqrt/.cbrt | M = * | D = / | A = + | S = -
        double result = 3 + 4 * (10 - 6) / 2.0 + Math.pow(2, 6);

        System.out.println(result);
    }
}
