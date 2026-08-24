package C1_Array.T2_SlidingWindow.Fixed_Size;

public class CountValidWindows {

    public static int countWindows(int[] nums, int k, int target) {

        // Write your logic here
        if (nums == null || nums.length < k || k <= 0) {
            return 0;
        }

        int sum = 0;
        // 1. Calculate the sum of the very first window
        for (int i = 0; i < k ; i++){
            sum += nums[i];
        }

        int count = 0;
        // 2. Check the first window BEFORE moving the window
        if (sum >= target) {
            count++;
        }

        // 3. Slide the window across the rest of the array
        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            if (sum >= target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int target1 = 7;

        int[] nums2 = {1, 1, 1, 1, 1};
        int k2 = 2;
        int target2 = 3;

        int[] nums3 = {5, 2, 8, 1, 4, 6};
        int k3 = 2;
        int target3 = 9;

        System.out.println(countWindows(nums1, k1, target1)); // Expected: 3
        System.out.println(countWindows(nums2, k2, target2)); // Expected: 0
        System.out.println(countWindows(nums3, k3, target3)); // Expected: 2
    }
}