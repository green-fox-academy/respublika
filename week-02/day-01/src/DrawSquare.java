
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=Integer.parseInt(in.nextLine());
        for (int i=1;i<=number;i++) {
            if (i==1 || i==number) { System.out.println("%%%%%");}
        else { System.out.println("%   %");};
        }
    }
}

