import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

    }

    public static String unique(int[] list) {
        ArrayList<Integer> uniqueList= new ArrayList<>();
        uniqueList.add(list[0]);
        for (int i = 1; i < list.length; i++) {
            if (uniqueList.contains(list[i])==false) {
                uniqueList.add(list[i]);
            }
        }

        String stringOut="";
        for (int i = 0; i < uniqueList.size() ; i++) {
            if (i<uniqueList.size()-1) {
                stringOut+=uniqueList.get(i)+", ";
            } else {stringOut+=uniqueList.get(i);}

        }
        return stringOut;
    }



}