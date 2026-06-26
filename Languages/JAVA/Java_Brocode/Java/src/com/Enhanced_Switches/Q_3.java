package com.Enhanced_Switches;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter token ID (1-Squaring, 2-Factorial, 3-Inverse): ");
        int tokenId = scanner.nextInt();

        int result = switch (tokenId) {
            case 1 -> base * base;
            case 2 -> {
                System.out.println("[Diagnostic] Computing factorial branch sequence...");
                int fact = 1;
                for (int i = 1; i <= base; i++){
                    fact *= i;
                }
                yield fact;
            }
            case 3 -> -base;
            default -> 0;
        };

        System.out.println("Final Matrix Result: " + result);
        scanner.close();
    }
}
