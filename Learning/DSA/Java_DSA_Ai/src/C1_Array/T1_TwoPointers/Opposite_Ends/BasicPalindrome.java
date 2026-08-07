package C1_Array.T1_TwoPointers.Opposite_Ends;

public class BasicPalindrome {

    public static boolean isPalindrome(String s) {

        // Write your logic here
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "racecar";
        System.out.println(isPalindrome(s1));

        String s2 = "hello";
        System.out.println(isPalindrome(s2));

    }
}