package C1_Array.T1_TwoPointers.Partition.LeetCode;

import java.util.Arrays;

public class Q_905_Me {

    public static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int B = 0;
            int S = 0;

            while (S < nums.length) {
                if (nums[S] % 2 == 0) {
                    int temp = nums[B];
                    nums[B] = nums[S];
                    nums[S] = temp;

                    B++;
                }
                S++;
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {3, 1, 2, 4};
        System.out.println("Test Case 1: " + Arrays.toString(solution.sortArrayByParity(nums1))); // Expected: [2, 4, 3, 1] or any valid parity order

        // Test Case 2
        int[] nums2 = {0};
        System.out.println("Test Case 2: " + Arrays.toString(solution.sortArrayByParity(nums2))); // Expected: [0]
    }
}