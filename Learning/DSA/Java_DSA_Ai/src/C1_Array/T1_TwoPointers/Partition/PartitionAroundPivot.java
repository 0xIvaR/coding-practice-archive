package C1_Array.T1_TwoPointers.Partition;

import java.util.Arrays;

public class PartitionAroundPivot {
    public static void partition(int[] nums, int pivot) {
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

        // FIX: Copy elements back into the original array reference
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {9, 12, 3, 5, 14, 10, 2, 10};
        int pivot = 10;
        partition(nums, pivot);
        System.out.println(Arrays.toString(nums));
        // Output: [9, 3, 5, 2, 10, 12, 14]
    }
}
