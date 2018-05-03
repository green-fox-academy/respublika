import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }
    private static String quoteSwap(ArrayList<String> list) {
        ArrayList<Integer> rightOrder = new ArrayList<Integer>(Arrays.asList(0, 1, 5, 3, 4, 2, 6, 7));
        String newString="";
        for (int i = 0; i < rightOrder.size(); i++) {
            newString=newString+list.get(rightOrder.get(i))+" ";
        }
        return newString;
    }
}