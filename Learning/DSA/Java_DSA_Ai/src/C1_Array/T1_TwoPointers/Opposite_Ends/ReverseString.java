package C1_Array.T1_TwoPointers.Opposite_Ends;

public class ReverseString {

    public static void reverseString(char[] s) {

        // Write your logic here
        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        // Print character array
        for (char chars : s){
            System.out.print(chars + " ");
        }

    }
}