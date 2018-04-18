
// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        String number = in.nextLine();
        int test=Integer.parseInt(number)%2;
        if (test==0) { System.out.println("The number is even.");}
        else { System.out.println("The number is odd.");}
    }
}
