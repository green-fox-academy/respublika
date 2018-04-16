
public class Reverse_v2 {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }

    private static String reverse(String reversed) {
        StringBuilder stringsb=new StringBuilder(reversed);
        stringsb.reverse();
        reversed=stringsb.toString();
        return reversed;
    }
}