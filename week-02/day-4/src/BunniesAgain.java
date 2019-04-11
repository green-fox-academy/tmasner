public class BunniesAgain {
    //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    public static void main(String[] args) {
        int numberOfEarsEven = 3;
        int numberOfEarsOdd = 2;
        int numberOfBunnies = 10;

        System.out.println(earsCalculator(numberOfBunnies, numberOfEarsEven, numberOfEarsOdd));

    }
    public static int earsCalculator(int bunnies, int earsOdd, int earsEven){
        if (bunnies == 0){
            return 0;
        }else if (bunnies %2 == 0){
            return earsEven + earsCalculator(bunnies -1, earsOdd, earsEven);
        } else {
            return earsOdd + earsCalculator(bunnies -1, earsEven,earsOdd);
        }
    }
}
