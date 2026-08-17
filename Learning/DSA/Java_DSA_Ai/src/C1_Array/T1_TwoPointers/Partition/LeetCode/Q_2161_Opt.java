package C1_Array.T1_TwoPointers.Partition.LeetCode;

import java.util.Arrays;

public class Q_2161_Opt {

    public static class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            int[] less = new int[nums.length];
            int[] equal = new int[nums.length];
            int[] high = new int[nums.length];

            int lessIndex = 0;
            int equalIndex = 0;
            int highIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < pivot) {
                    less[lessIndex++] = nums[i];
                } else if (nums[i] == pivot) {
                    equal[equalIndex++] = nums[i];
                } else {
                    high[highIndex++] = nums[i];
                }
            }

            int[] result = new int[nums.length];
            int index = 0;

            for (int i = 0; i < lessIndex; i++) result[index++] = less[i];
            for (int i = 0; i < equalIndex; i++) result[index++] = equal[i];
            for (int i = 0; i < highIndex; i++) result[index++] = high[i];

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {9, 12, 5, 10, 14, 3, 10};
        int pivot1 = 10;
        System.out.println("Test Case 1: " + Arrays.toString(solution.pivotArray(nums1, pivot1)));
        // Expected: [9, 5, 3, 10, 10, 12, 14]

        // Test Case 2
        int[] nums2 = {-3, 4, 3, 2};
        int pivot2 = 2;
        System.out.println("Test Case 2: " + Arrays.toString(solution.pivotArray(nums2, pivot2)));
        // Expected: [-3, 2, 4, 3]
    }
}