package C1_Array.T1_TwoPointers.Same_Direction;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        // Write your logic here
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        // Test Case 1
        String s1 = "abc";
        String t1 = "ahbgdc";

        System.out.println(isSubsequence(s1, t1));

        // Expected: true


        // Test Case 2
        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println(isSubsequence(s2, t2));

        // Expected: false
    }
}