package C1_Array.T1_TwoPointers.Opposite_Ends;

public class PairWithDifference {

    public static boolean hasPairWithDifference(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return false;
        }

        int L = 0;
        int R = 1;

        while (R < nums.length) {

            int diff = nums[R] - nums[L];

            if (diff == target) {
                return true;
            } else if (diff < target) {
                R++;
            } else {
                L++;
            }

            // Keep R ahead of L
            if (L == R) {
                R++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 3, 5, 7, 9};
        int target1 = 4;

        System.out.println(hasPairWithDifference(nums1, target1));

        // Test Case 2
        int[] nums2 = {2, 4, 6, 8, 10};
        int target2 = 3;

        System.out.println(hasPairWithDifference(nums2, target2));
    }
}