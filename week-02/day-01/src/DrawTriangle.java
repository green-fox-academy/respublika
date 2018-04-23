
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=Integer.parseInt(in.nextLine());
        String star="*";
        for (int i=1;i<=number;i++) {
            //String star2 = star.repeat(i);
            String star2 = new String(new char[i]).replace("\0", star);
            System.out.println(star2);
        }
    }
}


