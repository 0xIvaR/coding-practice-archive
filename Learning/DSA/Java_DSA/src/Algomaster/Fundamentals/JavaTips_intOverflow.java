package Algomaster.Fundamentals;

public class JavaTips_intOverflow {
    public static void main(String[] args) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE - 500;

        // BUG: if left + right > Integer.MAX_VALUE, this overflows
        //int mid = (left + right) / 2;

        // CORRECT: safe from overflow

        System.out.println(left);
        System.out.println(right);
        System.out.println();
        int mid = left + (right - left) / 2;

        System.out.println(mid);
    }
}
