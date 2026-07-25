package Algomaster.Fundamentals;

public class Use_Long_op {
    public static void main(String[] args) {

        // We take n as integer
        int n = Integer.MAX_VALUE;

        // Overflow: 100000 * 99999 > Integer.MAX_VALUE
        int wrong = n * (n - 1);

        // Cast to long first so Java uses 64-bit math and avoids a 32-bit int overflow.
        // Safe: cast to long BEFORE multiplication
        long correct = (long) n * (n - 1);

        // WRONG: casting AFTER multiplication is too late, overflow already happened
        long stillWrong = (long)(n * (n - 1));


        System.out.println(wrong);
        System.out.println(correct);
        System.out.println(stillWrong);
    }
}
