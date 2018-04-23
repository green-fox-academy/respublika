
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int rnum = rand.nextInt(10);
        //System.out.println(rnum);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a guess:");
        int guess=Integer.parseInt(in.nextLine());
        while (rnum!=guess) {
            if (rnum>guess) {
                System.out.println("The stored number is higher");}
            else {System.out.println("The stored number is lower");}
            Scanner in2=new Scanner(System.in);
            System.out.println("Enter a guess:");
            guess=Integer.parseInt(in2.nextLine());
        }
        System.out.println("You found the number: "+rnum);
    }
}
