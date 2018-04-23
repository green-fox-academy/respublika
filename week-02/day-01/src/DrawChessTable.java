

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
public class DrawChessTable {
    public static void main(String[] args) {
        for (int i=1;i<=8;i++) {
            if (i%2==0) {System.out.println(" % % % %");}
            else {System.out.println("% % % % ");}
        }
    }
}
