import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Give me first number");
        int Number1 = scanner1.nextInt();

        if (Number1 % 2 == 0) {
            System.out.println("odd");
        } else if (Number1 % 2 != 0) {
            System.out.println("even");
        }


    }
}