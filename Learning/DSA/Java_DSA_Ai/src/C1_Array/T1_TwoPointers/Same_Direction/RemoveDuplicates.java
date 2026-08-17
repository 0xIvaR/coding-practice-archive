package C1_Array.T1_TwoPointers.Same_Direction;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {

        // Edge case
        if (arr.length == 0) {
            return 0;
        }

        int write = 0;

        for (int read = 1; read < arr.length; read++) {

            if (arr[read] != arr[write]) {
                write++;
                arr[write] = arr[read];
            }
        }

        return write + 1;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] arr1 = {1, 1, 2, 2, 3};

        int newLength1 = removeDuplicates(arr1);

        System.out.print("Unique Elements: ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Test Case 2
        int[] arr2 = {1, 2, 2, 3, 3, 4};

        int newLength2 = removeDuplicates(arr2);

        System.out.print("Unique Elements: ");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}