package com.While_Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        String name;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Enter your name: ");
                name = scanner.nextLine().trim();
            } while (name.isEmpty());

            System.out.println("Hello " + name);
        }
    }
}
