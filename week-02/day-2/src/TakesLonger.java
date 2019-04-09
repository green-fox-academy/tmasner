public class TakesLonger {
    public static void main(String... args){
       // (original)String quote = "Hofstadter's Law: It yot expect, even when you take into account Hofstadter's Law."

        String quote = "Hofstadter's Law: It \" you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)


        String parts[] = quote.split("\"");{
        }
        String part0 = parts[0];
        String part1 = parts[1];
        String part2 = "always takes longer than";

        System.out.println(part0 + part2 + part1);

    }

}
