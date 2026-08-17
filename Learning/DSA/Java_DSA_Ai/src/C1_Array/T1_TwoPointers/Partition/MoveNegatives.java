package C1_Array.T1_TwoPointers.Partition;

import java.util.Arrays;

public class MoveNegatives {

    public static void moveNegatives(int[] nums) {

        // Write your logic here
        int B = 0;
        int S = 0;
        int temp;

        while (S < nums.length) {

            if (nums[S] < 0) {
                temp = nums[B];
                nums[B] = nums[S];
                nums[S] = temp;

                B++;
            }

            S++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, -3, 4, -1, 5, -6};

        moveNegatives(nums);

        System.out.println(Arrays.toString(nums));

        // Expected:
        // Any arrangement where all negative numbers
        // are on the left and non-negative numbers are on the right.
    }
}