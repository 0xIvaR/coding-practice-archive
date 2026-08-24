package C1_Array.T2_SlidingWindow.Fixed_Size;

public class MinWindowSum {

    public static int minWindowSum(int[] nums, int k) {

        // Write your logic here
        int sum = 0;
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }

        int minSum = sum;

        for (int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 2, 7, 1, 8, 3, 2};
        int k1 = 3;

        int[] nums2 = {5, 1, 2, 3, 4};
        int k2 = 2;

        int[] nums3 = {10, 2, 8, 1, 6};
        int k3 = 2;

        System.out.println(minWindowSum(nums1, k1)); // Expected: 10
        System.out.println(minWindowSum(nums2, k2)); // Expected: 3
        System.out.println(minWindowSum(nums3, k3)); // Expected: 9
    }
}