import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> mixed = new ArrayList<String>();
        int count=0;
        int until=0;
        if (girls.size()>boys.size()) {
            until=girls.size();
        } else if (girls.size()<boys.size()) {
            until=boys.size();
        } else {
            until=girls.size();
        }
        for (int i = 0; i <= until-1; i++) {
            if (girls.size()>=i+1 && boys.size()>=i+1) {
                mixed.add(count, girls.get(i));
                count++;
                mixed.add(count, boys.get(i));
                count++;
            } else if (girls.size()>=i+1) {
                mixed.add(count, girls.get(i));
                count++;
            } else {
                mixed.add(count, boys.get(i));
                count++;
            }
        }
        return mixed;

    }
}
