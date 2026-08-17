package C1_Array.T1_TwoPointers.Opposite_Ends;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        // Write your logic here
        int L = 0;
        int R = height.length - 1;
        int container = 0;

        while (L < R){
            int water = (R - L) * Math.min(height[L], height[R]);

            if (container < water){
                container = water;
            }

            if (height[L] < height[R]){
                L++;
            } else {
                R--;
            }

        }

        return container;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height1));

        // Expected Output: 49


        // Test Case 2
        int[] height2 = {1, 1};

        System.out.println(maxArea(height2));

        // Expected Output: 1
    }
}