package Hackerrank;
import java.util.Scanner;

public class Java_Stdin_out_1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int Int = scanner.nextInt();
        double Double = scanner.nextDouble();
        scanner.nextLine();
        String String = scanner.nextLine();

        System.out.println("String: " + String);
        System.out.println("Double: " + Double);
        System.out.println("Int: " + Int);

        scanner.close();
    }
}
