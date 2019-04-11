public class Bunnies {
    //We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        int numberOfEars = 2;
        int numberOfBunnies = 10;

        System.out.println(earsCalculator(numberOfBunnies, numberOfEars));
    }

    public static int earsCalculator(int bunnies, int ears) {

        if(bunnies == 0) {
            return 0;
        } else {
            return ears +earsCalculator(bunnies - 1, ears);
        }
    }
}
