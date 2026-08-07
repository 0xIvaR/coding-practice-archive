package C1_Array.T1_TwoPointers.Same_Direction;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        // Write your logic here
        int write = 0;

        for (int read = 0; read < nums.length; read++){
            if (nums[read] != val){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int newLength1 = removeElement(nums1, val1);

        for (int ans1 : nums1){
            System.out.print(ans1);
        }
        System.out.println();
        for (int i = 0; i < newLength1; i++) {
            System.out.print(nums1[i] + " ");
        }

        System.out.println();

        // Test Case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        int newLength2 = removeElement(nums2, val2);

        for (int i = 0; i < newLength2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}