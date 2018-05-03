
import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    private static ArrayList<String> appendA(List<String> list) {
        ArrayList<String> listA = new ArrayList<String>();
        for (int i = 0; i <= list.size()-1; i++) {
            String newElement=list.get(i) + "a";
            listA.add(i,newElement);
        }
        return listA;

    }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"