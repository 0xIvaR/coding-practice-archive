package C1_Array.T1_TwoPointers.Opposite_Ends;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        // REVIEW

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Store all valid triplets
        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Fix one number
        for (int fixed = 0; fixed < nums.length - 2; fixed++) {

            // Skip duplicate fixed values
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }

            // Step 3: Two pointers
            int L = fixed + 1;
            int R = nums.length - 1;

            while (L < R) {

                int sum = nums[fixed] + nums[L] + nums[R];

                if (sum == 0) {

                    // Found a triplet
                    result.add(Arrays.asList(
                            nums[fixed],
                            nums[L],
                            nums[R]
                    ));

                    L++;
                    R--;

                    // Skip duplicate L values
                    while (L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }

                    // Skip duplicate R values
                    while (L < R && nums[R] == nums[R + 1]) {
                        R--;
                    }

                } else if (sum < 0) {

                    // Need a bigger sum
                    L++;

                } else {

                    // Need a smaller sum
                    R--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums1));

        // Expected:
        // [[-1, -1, 2], [-1, 0, 1]]


        // Test Case 2
        int[] nums2 = {0, 1, 1};

        System.out.println(threeSum(nums2));

        // Expected:
        // []


        // Test Case 3
        int[] nums3 = {0, 0, 0, 0};

        System.out.println(threeSum(nums3));

        // Expected:
        // [[0, 0, 0]]
    }
}