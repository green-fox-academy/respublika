import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CharArrayToString {
    public static void main(String[] args) {
        //Write a Stream Expression to convert a char array to a string!

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'n', ' ', 'a', 'p', 'p', 'l', 'e', ' ', 'a', 's', ' ', 'a', 'l', 'w', 'a', 'y', 's'));

        String charToString = characters.stream()
                .map( s -> s.toString() )
                .collect( Collectors.joining( "" ) );

        System.out.println(charToString);


    }
}
