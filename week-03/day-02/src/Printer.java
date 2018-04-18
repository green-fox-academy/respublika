// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...



public class Printer {
    public static void main(String[] args) {
        System.out.println(printer("first"));
        System.out.println(printer("first", "second"));
        System.out.println(printer("first", "second", "third", "fourth"));
    }
    public static String printer(String ... str){
        String empty="";
        for (String i:str) {
            empty=String.join(" ", str);
        }
        return empty;
    }
}
