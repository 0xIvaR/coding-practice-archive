package C1_Array.T1_TwoPointers.Partition.LeetCode;

import java.util.Arrays;


// REVIEW + PRACTICE


public class Q_922_Me {

    public static int[] sortArrayByParityII(int[] nums) {

        int even = 0;
        int odd = 1;

        while (even < nums.length && odd < nums.length) {

            // Find an even index containing an odd number
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }

            // Find an odd index containing an even number
            while (odd < nums.length && nums[odd] % 2 != 0) {
                odd += 2;
            }

            // Swap the two incorrect values
            if (even < nums.length && odd < nums.length) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;

                even += 2;
                odd += 2;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 2, 5, 7};

        System.out.println(
                Arrays.toString(sortArrayByParityII(nums1))
        );

        // Possible output:
        // [4, 5, 2, 7]


        int[] nums2 = {2, 3};

        System.out.println(
                Arrays.toString(sortArrayByParityII(nums2))
        );

        // Output:
        // [2, 3]
    }
}