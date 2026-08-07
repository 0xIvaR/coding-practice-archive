package C1_Array.T1_TwoPointers.Same_Direction;

public class MoveZeroes {

    public static void MoveZeroes(int[] arr) {

        // Write your logic here
        int write = 0;

        for (int read = 0; read< arr.length; read++){
            if (arr[read] != 0){
                arr[write] = arr[read];
                write++;
            }
        }

        while (write < arr.length){
            arr[write] = 0;
            write++;
        }

    }

    public static void main(String[] args) {

        // Test Case 1
        int[] arr1 = {0, 1, 0, 3, 12};

        MoveZeroes(arr1);

        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Test Case 2
        int[] arr2 = {1, 0, 2, 0, 0, 3};

        MoveZeroes(arr2);

        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}