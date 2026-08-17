package C1_Array.T1_TwoPointers.Opposite_Ends;

import java.util.Arrays;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        // Write your logic here
        int L = 0;
        int R = numbers.length - 1;

        while (L < R){
            int sum = numbers[L] + numbers[R];

            if (sum == target) {
                return new int[]{L+1, R+1};
            } else if (sum < target) {
                L++;
            } else {
                R--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;

        System.out.println(Arrays.toString(twoSum(numbers1, target1)));

        // Test Case 2
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;

        System.out.println(Arrays.toString(twoSum(numbers2, target2)));
    }
}