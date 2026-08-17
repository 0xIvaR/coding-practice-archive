package C1_Array.T1_TwoPointers.Opposite_Ends;

public class PairWithSumClosest {

    public static int closestPairSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int closestSum = nums[left] + nums[right];

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                closestSum = sum;
            }

            if (sum == target) {
                return sum;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 2, 4, 7};
        int target1 = 10;

        System.out.println(closestPairSum(nums1, target1));

        // Test Case 2
        int[] nums2 = {1, 3, 5, 8};
        int target2 = 11;

        System.out.println(closestPairSum(nums2, target2));
    }
}