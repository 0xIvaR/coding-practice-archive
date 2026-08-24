package C1_Array.T2_SlidingWindow.Fixed_Size;

public class MaxVowelsWindow {

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {

        // Write your logic here
        int maxVowels = 0;
        int currentVowels = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        for (int i = k; i < s.length(); i++){
            if (isVowel(s.charAt(i))){
                currentVowels++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }

            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    public static void main(String[] args) {

        String s1 = "abciiidef";
        int k1 = 3;

        String s2 = "aeiou";
        int k2 = 2;

        String s3 = "leetcode";
        int k3 = 3;

        System.out.println(maxVowels(s1, k1)); // Expected: 3
        System.out.println(maxVowels(s2, k2)); // Expected: 2
        System.out.println(maxVowels(s3, k3)); // Expected: 2
    }
}