//Write a Stream Expression to find the uppercase characters in a string!

public class FindUpperCaseStream {
    public static void main(String[] args) {
        "appLE tRee".chars()
               .filter(s ->  Character.isUpperCase(s))
               .mapToObj(s -> (char) s)
               .forEach(System.out::println);

    }
}
