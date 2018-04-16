
public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }

    private static String reverse(String reversed) {
        String x="";
        for (int i = reversed.length()-1; i >= 0 ; i--) {
            x+=reversed.charAt(i);
        }
        return x;
    }
}