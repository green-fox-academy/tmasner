import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put a number and I will say you if it is odd or even");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.print("odd");
        } else {
            System.out.print("even");
        }


    }
}
