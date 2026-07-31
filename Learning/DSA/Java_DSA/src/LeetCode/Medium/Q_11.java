package LeetCode.Medium;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the heights separated by spaces (e.g., 1 8 6 2 5 4 8 3 7):");

        // 1. Read the entire line of input as a single String
        String inputLine = scanner.nextLine();

        // 2. Split the string by spaces into a String array
        String[] tokens = inputLine.split(" ");

        // 3. Create the integer array with the exact size of the tokens
        int[] height = new int[tokens.length];

        // 4. Convert each string token into an integer
        for (int i = 0; i < tokens.length; i++) {
            height[i] = Integer.parseInt(tokens[i]);
        }


        scanner.close();
    }
}
