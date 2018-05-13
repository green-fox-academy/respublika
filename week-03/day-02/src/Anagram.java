public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("dog", "god"));
        System.out.println(anagram("dog", "gods"));
        System.out.println(anagram("dogs", "god"));
        System.out.println(anagram("green", "fox"));
    }

    public static boolean anagram(String string1, String string2) {
        boolean returnValue=true;
        for (int i = 0; i <string1.length() ; i++) {
            if (string2.indexOf(string1.charAt(i))<0) {
                returnValue=false;
            }
        }

        if (string1.length()!=string2.length()) {
            returnValue=false;
        }

        return returnValue;
    }


}
