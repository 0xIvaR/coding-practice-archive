package Hackerrank;

import java.util.Scanner;

public class Java_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.print("Enter your number: ");
        N = scanner.nextInt();

        boolean evenCheck = (N % 2 == 0);

        if (evenCheck){
            if (N > 20){
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
