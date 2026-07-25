package Hackerrank;

import java.util.Scanner;

public class Java_End0fFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        String text;

        while (scanner.hasNext()){
            text = scanner.nextLine();
            System.out.println(n+" "+text);
            n++;
        }

        scanner.close();
    }
}
