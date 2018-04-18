

// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter number 1:");
        String number1 = in1.nextLine();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter number 2:");
        String number2 = in2.nextLine();
        if (Integer.parseInt(number1)<Integer.parseInt(number2)) { System.out.println(number2);}
        else if(Integer.parseInt(number1)>Integer.parseInt(number2)) { System.out.println(number1);}
        else if(Integer.parseInt(number1)==Integer.parseInt(number2)) { System.out.println("The 2 number is equal.");}
    }
}
