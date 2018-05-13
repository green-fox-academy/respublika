// - Create an array variable named `animals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end

public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"kuty", "macsk", "cic"};

        for (int i = 0; i < animals.length; i++) {
            animals[i]=animals[i] + "a";
        }
    }
}
