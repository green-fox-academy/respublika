import java.util.ArrayList;
import java.util.HashMap;

public class CountLetters {

    public static HashMap countLetters(String string) {
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> charCount = new ArrayList<>();

                for (int i = 0; i < string.length(); i++) {
                    if (charList.contains(string.charAt(i)) == false) {
                        charList.add(string.charAt(i));
                    }
                }

                for (Character charToCount : charList) {
                    int charCountInt = 0;
                    for (int i = 0; i < string.length(); i++) {
                        if (string.charAt(i) == charToCount) {
                            charCountInt++;
                        }
                charCount.add(charList.indexOf(charToCount), charCountInt);
                    }
                }

        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < charList.size(); i++) {
            resultMap.put(charList.get(i), charCount.get(i));
        }

        return resultMap;

    }
}
