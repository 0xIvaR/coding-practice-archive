package LeetCode.Easy;

import java.util.Arrays;

public class Q_349_My {

    // Public nested static class
    public static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            // Write your logic here

            return new int[]{};
        }
    }

    public static void main(String[] args) {
        // Instantiate the public solution class
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums1_2 = {2, 2};
        System.out.println("Test Case 1: " + Arrays.toString(solution.intersection(nums1_1, nums1_2))); // Expected: [2]

        // Test Case 2
        int[] nums2_1 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        System.out.println("Test Case 2: " + Arrays.toString(solution.intersection(nums2_1, nums2_2))); // Expected: [9, 4]
    }
}