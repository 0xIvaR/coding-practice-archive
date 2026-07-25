package Hackerrank;

import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Read the total number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            // Start the loop to process each test case one by one
            for (int i = 0; i < t; i++) {
                // Read the input as a String to safely handle arbitrarily large numbers
                String n = scanner.next();

                // Flags to track which datatypes the number can fit into
                boolean fitsInByte = false;
                boolean fitsInShort = false;
                boolean fitsInInt = false;
                boolean fitsInLong = false;
                boolean fitsAnywhere = false;

                // 1. Check Byte
                try {
                    Byte.parseByte(n);
                    fitsInByte = true;
                    fitsAnywhere = true;
                } catch (NumberFormatException e) {
                    // Do nothing; it leaves fitsInByte as false
                }

                // 2. Check Short
                try {
                    Short.parseShort(n);
                    fitsInShort = true;
                    fitsAnywhere = true;
                } catch (NumberFormatException e) {
                    // Do nothing
                }

                // 3. Check Int
                try {
                    Integer.parseInt(n);
                    fitsInInt = true;
                    fitsAnywhere = true;
                } catch (NumberFormatException e) {
                    // Do nothing
                }

                // 4. Check Long
                try {
                    Long.parseLong(n);
                    fitsInLong = true;
                    fitsAnywhere = true;
                } catch (NumberFormatException e) {
                    // Do nothing
                }

                // Formatting Decision Tree: Print the results immediately
                if (fitsAnywhere) {
                    System.out.println(n + " can be fitted in:");
                    if (fitsInByte) {
                        System.out.println("* byte");
                    }
                    if (fitsInShort) {
                        System.out.println("* short");
                    }
                    if (fitsInInt) {
                        System.out.println("* int");
                    }
                    if (fitsInLong) {
                        System.out.println("* long");
                    }
                } else {
                    System.out.println(n + " can't be fitted anywhere.");
                }
            }
        }

        scanner.close();
    }
}