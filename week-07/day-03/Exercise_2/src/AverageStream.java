import java.util.ArrayList;
import java.util.Arrays;

public class AverageStream {

    public static void main(String[] args) {
        //Write a Stream Expression to get the average value of the odd numbers from the following array

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        System.out.println(numbers.stream()
                .filter(x -> x%2 != 0)
                .mapToDouble(x -> x)
                .average().getAsDouble());
    }
}
