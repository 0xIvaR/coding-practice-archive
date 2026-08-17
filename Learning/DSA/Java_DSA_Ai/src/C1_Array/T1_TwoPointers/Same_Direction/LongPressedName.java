package C1_Array.T1_TwoPointers.Same_Direction;

public class LongPressedName {

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0; // Pointer for name
        int j = 0; // Pointer for typed

        int n = name.length();
        int m = typed.length();

        while (j < m) {
            // Case 1: Characters match
            if (i < n && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // Case 2: Long press repeat (matches previous typed char)
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            // Case 3: Invalid character or early mismatch
            else {
                return false;
            }
        }

        // All characters in name must be matched
        return i == n;
    }

    public static void main(String[] args) {

        // Test Case 1
        String name1 = "alex";
        String typed1 = "aaleex";

        System.out.println(isLongPressedName(name1, typed1));
        // Expected: true


        // Test Case 2
        String name2 = "saeed";
        String typed2 = "ssaaedd";

        System.out.println(isLongPressedName(name2, typed2));
        // Expected: false


        // Test Case 3
        String name3 = "leelee";
        String typed3 = "lleeelee";

        System.out.println(isLongPressedName(name3, typed3));
        // Expected: true
    }
}