package Hackerrank;

import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We use a StringBuilder to collect all the formatted rows quietly
        StringBuilder outputBuffer = new StringBuilder();

        while (scanner.hasNext()){
            String s1 = scanner.next();
            int x = scanner.nextInt();

            // Instead of printing, we format it and append it to our buffer
            String formattedRow = String.format("%-15s%03d\n", s1, x);
            outputBuffer.append(formattedRow);
        }

        // Everything prints out together at the very end after the loop stops
        System.out.println("================================");
        System.out.print(outputBuffer.toString());
        System.out.println("================================");

        scanner.close();
    }
}