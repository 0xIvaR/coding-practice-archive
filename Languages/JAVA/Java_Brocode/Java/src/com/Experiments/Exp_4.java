package com.Experiments;

import java.util.Scanner;

public class Exp_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exp;

        System.out.println("Enter thought: ");
        exp = scanner.hasNextBoolean();

        System.out.println(exp);
    }
}
