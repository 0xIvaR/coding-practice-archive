package C1_Array.T2_SlidingWindow.Fixed_Size;

public class SlidingWindow {

    public static void main(String[] args) {

        // Test case
        int[] nums = {3, 5, 2, 8, 1, 4};
        int k = 3;

        // Step 1: Calculate the sum of the first window
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Step 2: The first window is our initial maximum
        int maxSum = sum;

        // Step 3: Start sliding the window
        int left = 0;

        for (int right = k; right < nums.length; right++) {

            // Remove the element leaving the window
            // Add the element entering the window
            sum = sum - nums[left] + nums[right];

            // Move the left side of the window
            left++;

            // Update maximum sum
            maxSum = Math.max(maxSum, sum);
        }

        // Final answer
        System.out.println("Maximum sum = " + maxSum);
    }
}