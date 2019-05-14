import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {

        //Write a Stream Expression to find the uppercase characters in a string!
        String name = "ssawdisDIsalVsaIsaNEs";
        Stream<Character> characterStream = name.chars()
                .mapToObj(c -> (char) c);
        List<Character> capitals =
                characterStream.filter(character -> Character.isUpperCase(character))
                        .collect(Collectors.toList());
        System.out.println(capitals);
    }
}
