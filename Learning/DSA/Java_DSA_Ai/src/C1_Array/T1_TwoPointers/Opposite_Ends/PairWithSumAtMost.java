package C1_Array.T1_TwoPointers.Opposite_Ends;

public class PairWithSumAtMost {

    public static int maxPairSumAtMost(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int bestSum = 0;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum <= target) {

                if (sum > bestSum) {
                    bestSum = sum;
                }

                left++;

            } else {
                right--;
            }
        }

        return bestSum;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 2, 4, 6, 8};
        int target1 = 11;

        System.out.println(maxPairSumAtMost(nums1, target1));

        // Test Case 2
        int[] nums2 = {2, 5, 7, 10, 14};
        int target2 = 12;

        System.out.println(maxPairSumAtMost(nums2, target2));
    }
}