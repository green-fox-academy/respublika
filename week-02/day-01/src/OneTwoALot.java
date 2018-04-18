
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        String number = in.nextLine();
        if (Integer.parseInt(number)<=0) { System.out.println("Not enough");}
        else if(Integer.parseInt(number)==1) { System.out.println("One");}
        else if(Integer.parseInt(number)==2) { System.out.println("Two");}
        else if(Integer.parseInt(number)>2) { System.out.println("A lot");}
    }
}
