// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output


public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] diagonal = new int [4][4];
        int pos=0;
        for (int i = 0; i <=3; i++) {
            diagonal[i][pos]=1;
            pos++;
        }

        String print="";
        for (int i = 0; i <=3 ; i++) {
            for (int j = 0; j <=3 ; j++) {
                if (j<3) {
                    print += diagonal[i][j] + " ";
                } else {
                    print += diagonal[i][j] + "\n";
                }
            }
        }

        System.out.println(print);

    }
}
