import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise7 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        String startingLetter = "A";
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        Stream<String> citiesStartingWithGivenLetter = cities.stream()
                .filter(city -> city.startsWith(startingLetter));
        System.out.println(citiesStartingWithGivenLetter.collect(Collectors.toList()));
    }
}
