public class TakesLonger {
    public static void main(String[] args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder quotesb=new StringBuilder(quote);
        quotesb.insert(20, " always takes longer than");
        quote=quotesb.toString();
        System.out.println(quote);
    }
}
