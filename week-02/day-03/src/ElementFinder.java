
import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSeven2(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }
    private static String containsSeven(ArrayList<Integer> list) {
        if (list.contains(7)) {
            return "Hoorray";
        } else {return "Noooooo";}
    }

    private static String containsSeven2(ArrayList<Integer> list) {
        if (list.indexOf(7)>=0) {
            return "Hoorray";
        } else {return "Noooooo";}
    }
}