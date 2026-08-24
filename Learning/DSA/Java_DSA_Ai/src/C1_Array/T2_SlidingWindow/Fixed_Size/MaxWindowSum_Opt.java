package C1_Array.T2_SlidingWindow.Fixed_Size;

public class MaxWindowSum_Opt {

    public static int maxWindowSum(int[] nums, int k) {

        // Write your logic here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 1, 6, 2, 8, 4, 5};
        int k1 = 3;

        int[] nums2 = {2, 1, 5, 1, 3, 2};
        int k2 = 3;

        int[] nums3 = {5, 5, 5, 5, 5};
        int k3 = 2;

        System.out.println(maxWindowSum(nums1, k1)); // Expected: 17
        System.out.println(maxWindowSum(nums2, k2)); // Expected: 9
        System.out.println(maxWindowSum(nums3, k3)); // Expected: 10
    }
}