import java.util.ArrayList;
import java.util.Arrays;

public class FilterSquaredStream {
    public static void main(String[] args) {
        //Write a Stream Expression to find which number squared value is more then 20 from the following array

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        numbers.stream()
                .map(x -> x*x)
                .filter(x -> x > 20)
                .map(x -> Math.sqrt(x))
                .mapToInt(x -> Math.round(Math.round(x)))
                .forEach(System.out::println);
    }
}
