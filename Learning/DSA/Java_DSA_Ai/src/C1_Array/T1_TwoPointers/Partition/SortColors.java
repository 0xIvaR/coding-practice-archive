package C1_Array.T1_TwoPointers.Partition;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {

        // Write your logic here
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high){
            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }


    }

    public static void main(String[] args) {

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        // Expected: [0, 0, 1, 1, 2, 2]


        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2));

        // Expected: [0, 1, 2]


        int[] nums3 = {0, 1, 2, 0, 1, 2};
        sortColors(nums3);
        System.out.println(Arrays.toString(nums3));

        // Expected: [0, 0, 1, 1, 2, 2]


        int[] nums4 = {2, 2, 2, 1, 1, 0};
        sortColors(nums4);
        System.out.println(Arrays.toString(nums4));

        // Expected: [0, 1, 1, 2, 2, 2]
    }
}