public class SumDigits {
    //Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    // SumDigits (126 -> 1+2+6=9)

    public static void main(String[] args) {
        int x = 126;
        System.out.println(SumDigits (x));

    }
    public static int SumDigits (int n) {
        if (n == 0){
            return 0;
        } else {
            return n %10 + SumDigits(n / 10);
        }
    }
}
