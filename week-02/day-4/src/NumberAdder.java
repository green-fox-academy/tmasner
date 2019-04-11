public class NumberAdder {

    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {

        int x = 3;

        System.out.println(recursivAdder(x));

    }
    public static int recursivAdder (int n) {

        if (n == 1) {
            return 1;
        } else{
            return n + recursivAdder(n - 1);
        }
    }

}


