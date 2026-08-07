package LeetCode.Easy;

public class Q_628_Opt {

    // Your single-pass O(n) approach
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int n = nums[i];

            // Shifting logic for 3 largest numbers
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            // Shifting logic for 2 smallest numbers
            if (n < min2) {
                if (n < min1) {
                    min2 = min1;
                    min1 = n;
                } else {
                    min2 = n;
                }
            }
        }

        int a = max1 * max2 * max3;
        int b = max1 * min1 * min2;
        return a > b ? a : b;
    }

    // Main method to run and test locally
    public static void main(String[] args) {
        Q_628_Opt solver = new Q_628_Opt();

        // Test Case 1: Simple positive numbers
        int[] test1 = {1, 2, 3, 4};
        System.out.println("Test 1 Output: " + solver.maximumProduct(test1) + " (Expected: 24)");

        // Test Case 2: The tricky negative numbers case
        int[] test2 = {-100, -98, -1, 2, 3, 4};
        System.out.println("Test 2 Output: " + solver.maximumProduct(test2) + " (Expected: 39200)");

        // Test Case 3: All negative numbers
        int[] test3 = {-1, -2, -3, -4};
        System.out.println("Test 3 Output: " + solver.maximumProduct(test3) + " (Expected: -6)");
    }
}