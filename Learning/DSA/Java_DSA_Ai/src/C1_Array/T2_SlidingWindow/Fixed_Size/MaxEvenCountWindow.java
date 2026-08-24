package C1_Array.T2_SlidingWindow.Fixed_Size;

public class MaxEvenCountWindow {

    public static int maxEvenCount(int[] nums, int k) {

        // Write your logic here
        int evenCount = 0;

        for (int i = 0; i < k; i++){
            if (nums[i] % 2 == 0){
                evenCount++;
            }
        }

        int maxCount = evenCount;

        int left = 0;
        for (int right = k; right< nums.length; right++){
            if (nums[right - k] % 2 == 0){
                evenCount--;
            }
            if (nums[right] % 2 == 0){
                evenCount++;
            }

            maxCount = Math.max(maxCount, evenCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 1, 4, 6, 3, 8, 5};
        int k1 = 3;

        int[] nums2 = {1, 3, 5, 7, 2, 4};
        int k2 = 2;

        int[] nums3 = {2, 4, 6, 8, 10};
        int k3 = 3;

        System.out.println(maxEvenCount(nums1, k1)); // Expected: 2
        System.out.println(maxEvenCount(nums2, k2)); // Expected: 1
        System.out.println(maxEvenCount(nums3, k3)); // Expected: 3
    }
}