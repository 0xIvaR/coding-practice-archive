package LeetCode.Easy;

public class Q_125_Opt {

    public static class Solution {

        public boolean isPalindrome(String s) {

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {

                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));

                if (leftChar != rightChar) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Test Case 1: " + solution.isPalindrome(s1)); // Expected: true

        // Test Case 2
        String s2 = "race a car";
        System.out.println("Test Case 2: " + solution.isPalindrome(s2)); // Expected: false

        // Test Case 3
        String s3 = " ";
        System.out.println("Test Case 3: " + solution.isPalindrome(s3)); // Expected: true
    }
}