public class Strings {
    //Given a string, compute recursively (no loops) a new string
    // where all the lowercase 'x' chars have been changed to 'y' chars.

    public static void main (String[] args) {

        String inputWord = "XXXxxxxXXXXxxxxXXX";
        int numberOfLetters = inputWord.length();
        int counter = 0;

        System.out.println(stringChanger(inputWord, numberOfLetters, counter));
    }

    public static String stringChanger(String word, int numberOfLetters, int number) {

        char x = 'x';
        char y = 'y';

        if (number == numberOfLetters) {

            return word;

        } else if (word.charAt(number) == x){

            return stringChanger((word.substring(0, number) + y + word.substring(number + 1)), numberOfLetters, number + 1);

        } else {

            return stringChanger(word, numberOfLetters, number + 1);

        }
    }
}