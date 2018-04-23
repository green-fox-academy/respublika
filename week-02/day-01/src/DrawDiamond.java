
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int lines = Integer.parseInt(in.nextLine());
        String st = "*";
        String sp = " ";
        if (lines%2==0) {
        int totalChar = lines - 1;
            for (int j = 1; j <= totalChar; j += 2) {
                int fCount = (int) Math.round((totalChar - (double) j) / 2);
                int eCount = totalChar - fCount - j;
                String f = new String(new char[fCount]).replace("\0", sp);
                String c = new String(new char[j]).replace("\0", st);
                String e = new String(new char[eCount]).replace("\0", sp);
                System.out.println(f + c + e);
            }
            for (int k = lines-1; k >= 0; k -= 2) {
                int fCount = (int) Math.round((totalChar - (double) k) / 2);
                int eCount = totalChar - fCount - k;
                String f = new String(new char[fCount]).replace("\0", sp);
                String c = new String(new char[k]).replace("\0", st);
                String e = new String(new char[eCount]).replace("\0", sp);
                System.out.println(f + c + e);
            }
        }
        else {
            int totalChar=lines;
                for (int j = 1; j <= totalChar; j += 2) {
                    int fCount = (int) Math.round((totalChar - (double) j) / 2);
                    int eCount = totalChar - fCount - j;
                    String f = new String(new char[fCount]).replace("\0", sp);
                    String c = new String(new char[j]).replace("\0", st);
                    String e = new String(new char[eCount]).replace("\0", sp);
                    System.out.println(f + c + e);
                }

                for (int l = totalChar-2; l >= 0; l -= 2) {
                    int fCount = (int) Math.round((totalChar - (double) l) / 2);
                    int eCount = totalChar - fCount - l;
                    String f = new String(new char[fCount]).replace("\0", sp);
                    String c = new String(new char[l]).replace("\0", st);
                    String e = new String(new char[eCount]).replace("\0", sp);
                    System.out.println(f + c + e);
                }
            }
            }
            }



