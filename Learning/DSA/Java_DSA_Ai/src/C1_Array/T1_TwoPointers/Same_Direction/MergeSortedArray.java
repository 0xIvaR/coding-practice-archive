package C1_Array.T1_TwoPointers.Same_Direction;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Write your logic here
        int p1 = m - 1;
        int p2 = n - 1;
        int write = nums1.length - 1;

        while(p1 >= 0 && p2 >= 0){
            if (nums1[p1] < nums2[p2]){
                nums1[write] = nums2[p2];
                write--;
                p2--;
            } else {
                nums1[write] = nums1[p1];
                write--;
                p1 --;
            }
        }

        while (p2 >= 0) {
            nums1[write] = nums2[p2];
            write--;
            p2--;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};

        merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Test Case 2
        int[] nums3 = {1, 4, 7, 0, 0};
        int[] nums4 = {2, 3};

        merge(nums3, 3, nums4, 2);

        for (int num : nums3) {
            System.out.print(num + " ");
        }
    }
}