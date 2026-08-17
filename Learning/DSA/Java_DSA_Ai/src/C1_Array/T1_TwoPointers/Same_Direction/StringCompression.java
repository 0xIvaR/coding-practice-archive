package C1_Array.T1_TwoPointers.Same_Direction;

import java.util.Arrays;

public class StringCompression {

    public static int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];

            // Count consecutive occurrences
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                count++;
                read++;
            }

            // Write the character
            chars[write] = current;
            write++;

            // Write the count if greater than 1
            if (count > 1) {

                String countString = String.valueOf(count);

                for (int i = 0; i < countString.length(); i++) {
                    chars[write] = countString.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int length1 = compress(chars1);

        System.out.println(Arrays.toString(chars1));
        System.out.println("Length: " + length1);


        char[] chars2 = {'a'};

        int length2 = compress(chars2);

        System.out.println(Arrays.toString(chars2));
        System.out.println("Length: " + length2);
    }
}