package C1_Array.T1_TwoPointers.Partition;

import java.util.Arrays;

public class MoveZeroesPartition {

    public static void moveZeroes(int[] nums) {
        int B = 0;
        int S = 0;
        int temp;

        while (S < nums.length) {

            // your logic
            if (nums[S] != 0) {
                temp = nums[B];
                nums[B] = nums[S];
                nums[S] = temp;

                B++;
            }

            S++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

        // Expected:
        // [1, 3, 12, 0, 0]
    }
}