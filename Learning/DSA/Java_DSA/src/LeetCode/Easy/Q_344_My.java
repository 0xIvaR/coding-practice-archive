package LeetCode.Easy;

import java.util.Arrays;

public class Q_344_My {

    public static class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while(left < right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println("Test Case 1: " + Arrays.toString(s1)); // Expected: [o, l, l, e, h]

        // Test Case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s2);
        System.out.println("Test Case 2: " + Arrays.toString(s2)); // Expected: [h, a, n, n, a, H]
    }
}