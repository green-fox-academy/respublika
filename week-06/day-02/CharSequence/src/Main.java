public class Main {
    public static void main(String[] args) {
        Gnirts string1=new Gnirts("for example");
        System.out.println(string1.string);
        System.out.println(string1.length());
        System.out.println(string1.charAt(2));
        System.out.println(string1.subSequence(3, 6));

        Shifter string2=new Shifter("for example", 2);
        System.out.println(string2.string);
        System.out.println(string2.length());
        System.out.println(string2.charAt(2));
        System.out.println(string2.subSequence(3, 6));
    }
}
