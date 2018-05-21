import java.util.Map;
import java.util.stream.Collectors;

public class CountLettersStream {
    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!
        String string = "I hate this task :(";


        Map<Character, Long> countChars = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        countChars.forEach((k, v) -> System.out.println(k + "=" + v));


    }
}

