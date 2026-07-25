package Hackerrank;

import java.util.Scanner;

public class Java_StaticInitializer_Block {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B, H;
        B = scanner.nextInt();
        H = scanner.nextInt();

        boolean condition = (B <= 0 || H <= 0);

        if (!condition){
            int cal = B * H;
            System.out.println(cal);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        scanner.close();
    }
}
