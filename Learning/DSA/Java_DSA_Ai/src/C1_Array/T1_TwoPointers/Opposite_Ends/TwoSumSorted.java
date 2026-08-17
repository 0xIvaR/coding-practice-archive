package C1_Array.T1_TwoPointers.Opposite_Ends;

public class TwoSumSorted {

    public static boolean hasPairWithTarget(int[] nums, int target) {

        // Write your logic here
        int L = 0;
        int R = nums.length - 1;

        while (L < R){
            int sum = nums[L] + nums[R];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                L++;
            } else {
                R--;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 2, 4, 6, 8, 9};
        int target1 = 10;

        System.out.println(hasPairWithTarget(nums1, target1));

        // Test Case 2
        int[] nums2 = {1, 3, 5, 7, 9, 12};
        int target2 = 10;

        System.out.println(hasPairWithTarget(nums2, target2));
    }
}