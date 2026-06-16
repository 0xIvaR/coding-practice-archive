package com.InputOps;

import java.util.Scanner;

public class Input_1 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);

        //To take entire line use nextLine
        System.out.println("Your name is: "+ input.nextLine());
    }
}
