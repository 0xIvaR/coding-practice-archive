package LeetCode.Easy;

import java.util.Arrays;

public class Q_1_My {

    // Public nested static class prevents package conflicts while staying public
    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            // Write your logic here


            return new int[]{};
        }
    }

    public static void main(String[] args) {
        // Instantiate the public solution class
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test Case 1: " + Arrays.toString(solution.twoSum(nums1, target1))); // Expected: [0, 1]

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test Case 2: " + Arrays.toString(solution.twoSum(nums2, target2))); // Expected: [1, 2]

        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Test Case 3: " + Arrays.toString(solution.twoSum(nums3, target3))); // Expected: [0, 1]
    }
}