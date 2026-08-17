package C1_Array.T1_TwoPointers.Partition.LeetCode;

import java.util.Arrays;

public class Q_283_Me {

    public static class Solution {
        public void moveZeroes(int[] nums) {
            int W = 0;
            int S = 0;
            int temp;

            while (S < nums.length) {
                if (nums[S] != 0) {
                    temp = nums[W];
                    nums[W] = nums[S];
                    nums[S] = temp;
                    W++;
                }
                S++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println("Test Case 1: " + Arrays.toString(nums1)); // Expected: [1, 3, 12, 0, 0]

        // Test Case 2
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println("Test Case 2: " + Arrays.toString(nums2)); // Expected: [0]
    }
}