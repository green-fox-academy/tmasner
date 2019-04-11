public class GreatestCommonDivisor {
    //Find the greatest common divisor of two numbers using recursion.
    public static void main(String[] args) {
        int firstNumber = 6;
        int secondNumber = 9;
        int divisor = 0;

        if (firstNumber < secondNumber) {

            divisor = firstNumber;
        } else {
            divisor = secondNumber;
        }
        System.out.println(commonDivisor(firstNumber, secondNumber, divisor));
    }

    public static int commonDivisor(int firstNumber, int secondNumber, int divisor) {

        if(firstNumber %  divisor == 0 && secondNumber % divisor == 0){
            return divisor;
        } else  {
            return commonDivisor(firstNumber, secondNumber, divisor - 1);
        }

    }
}
