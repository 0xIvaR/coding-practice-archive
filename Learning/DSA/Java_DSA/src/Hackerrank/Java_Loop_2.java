package Hackerrank;

import java.util.Scanner;

public class Java_Loop_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder finalOutput = new StringBuilder();

        int q, a, b, n;
        int newCal = 0;

        q = scanner.nextInt();
        if (q >= 0 && q <= 500){
            for (int i = 0; i<q; i++){
                a = scanner.nextInt();
                b = scanner.nextInt();
                n = scanner.nextInt();


                if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)){
                    int currentTerm = a;
                    for (int j = 0; j < n; j++){
                        currentTerm += (1 << j) * b;
                        finalOutput.append(currentTerm).append(" ");
                    }
                    finalOutput.append("\n");
                }
            }
        }

        scanner.close();

        System.out.print(finalOutput.toString());
    }
}
