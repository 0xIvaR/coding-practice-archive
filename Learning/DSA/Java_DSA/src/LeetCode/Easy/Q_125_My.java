package LeetCode.Easy;

public class Q_125_My {

    public static class Solution {
        public boolean isPalindrome(String s) {
            // Write your logic here
            String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
            cleaned = cleaned.toLowerCase();
            int left = 0;
            int right = cleaned.length() - 1;

            while (left < right){

                if (cleaned.charAt(left) != cleaned.charAt(right)){
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