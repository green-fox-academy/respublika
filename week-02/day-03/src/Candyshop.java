
import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
    private static ArrayList<String> sweets(ArrayList<Object> list) {
        ArrayList<String> Candy = new ArrayList<String>();
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i).equals(2)) {
                Candy.add(i,"Croissant");
            } else if (list.get(i).equals(false)) {
                Candy.add(i, "Ice cream");
            } else {
                String newElement=String.valueOf(list.get(i));;
                Candy.add(i, newElement);
            }
        }
        return Candy;

    }
}