package LeetCode.Easy;

import java.util.Arrays;

public class Q_628_My {

    // Your exact approach wrapped inside the class
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        // Scene 1: Product of the three largest numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Scene 2: Product of the two smallest numbers and the largest number
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    // Main method to run and test your code locally
    public static void main(String[] args) {
        // Create an instance of your class
        Q_628_My solver = new Q_628_My();

        // Test Case 1: Simple positive numbers
        int[] test1 = {1, 2, 3, 4};
        System.out.println("Test 1 Output: " + solver.maximumProduct(test1) + " (Expected: 24)");

        // Test Case 2: The tricky negative numbers case we discussed
        int[] test2 = {-100, -98, -1, 2, 3, 4};
        System.out.println("Test 2 Output: " + solver.maximumProduct(test2) + " (Expected: 39200)");

        // Test Case 3: All negative numbers
        int[] test3 = {-1, -2, -3, -4};
        System.out.println("Test 3 Output: " + solver.maximumProduct(test3) + " (Expected: -6)");
    }
}
