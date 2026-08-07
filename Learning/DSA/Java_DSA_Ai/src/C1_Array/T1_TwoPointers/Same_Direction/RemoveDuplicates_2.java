package C1_Array.T1_TwoPointers.Same_Direction;

public class RemoveDuplicates_2 {
    public static int remove(int[] arr){

        int write = 0;

        for (int read = 1; read < arr.length ; read++){

            if (arr[read] != arr[write]){
                write++;
                arr[write] = arr[read];
            }
        }

        return write + 1;
    }

    public static void main(String[] args) {

        // test case 1
        int[] arr1 = {1,1,2,2,3,3,3};
        int newNum1 = remove(arr1);

        for (int i = 0; i < newNum1; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        // test case 2
        int[] arr2 = {1,2,3,4,4,5,6,6};
        int newNum2 = remove(arr2);

        for (int i = 0; i < newNum2; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
