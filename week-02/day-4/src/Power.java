public class Power {
    //Given base and n that are both 1 or more,
    // compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public static void main(String[] args) {

        int base = 3;
        int n = 2;

        System.out.println(PowerRecursive(base, n));
    }
    public static int PowerRecursive (int base, int n){
        if (n == 0){
            return 1;
        } else {
            return base * PowerRecursive(base, n - 1);
        }
    }
}
