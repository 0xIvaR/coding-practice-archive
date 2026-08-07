package C1_Array.T1_TwoPointers.Opposite_Ends;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        // Write your logic here
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        cleaned = cleaned.toLowerCase();
        return BasicPalindrome.isPalindrome(cleaned);
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));

    }
}