
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int lines=Integer.parseInt(in.nextLine());
        String st="*";
        String sp=" ";
        int totalChar=lines+3;

            for (int j=1;j<=totalChar;j+=2) {
                int fCount=Math.round((totalChar-j)/2);
                int eCount=totalChar-fCount-j;
                String f = new String(new char[fCount]).replace("\0", sp);
                String c = new String(new char[j]).replace("\0", st);
                String e = new String(new char[eCount]).replace("\0", sp);
                System.out.println(f+c+e);


        }
    }
}
