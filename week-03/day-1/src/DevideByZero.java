import java.util.Scanner;


   public class DevideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number and I will divide 10 with this number.");
        int divisor = scanner.nextInt();

        tenDividebyNumber(divisor);
    }
    public static void tenDividebyNumber(int divisor){
        try{
            double result = 10 / divisor;
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.out.println("fail !!!");
        }
    }
}
