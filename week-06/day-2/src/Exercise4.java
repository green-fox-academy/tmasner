import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {

        //Write a Stream Expression to get the average value of the odd numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        IntSummaryStatistics stats =
                numbers.stream()
                        .filter(n -> n % 2 != 0)
                        .mapToInt(Integer::intValue)
                        .summaryStatistics();
        System.out.println(stats);
    }
}
