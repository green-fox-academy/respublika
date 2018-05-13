// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};

        int count=aj.length-1;
        for (int i = 0; i < aj.length/2 ; i++) {
            int saveLater=aj[i];
            aj[i]=aj[count];
            aj[count]=saveLater;
            count--;
        }

        for (int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }

    }
}
