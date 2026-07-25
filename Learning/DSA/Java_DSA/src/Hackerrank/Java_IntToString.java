package Hackerrank;
import java.util.Scanner;

public class Java_IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the integer n from standard input
        int n = scanner.nextInt();

        // 2. Convert the integer into a String named 's'
        String s = String.valueOf(n);

        // The problem description mentions that the backend handles the rest,
        // but since this specific template is completely blank, we add the
        // validation check here to ensure it prints correctly!
        if (n >= -100 && n <= 100) {
            if (s.equals(Integer.toString(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        }

        scanner.close();
    }
}