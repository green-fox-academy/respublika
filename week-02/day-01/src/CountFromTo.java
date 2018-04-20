
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner in1=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1=Integer.parseInt(in1.nextLine());
        Scanner in2=new Scanner(System.in);
        System.out.println("Enter a another number:");
        int number2=Integer.parseInt(in2.nextLine());
        if (number2<=number1) {System.out.println("The second number should be bigger");}
        else {
            for (int i=number1; i<number2;i++) {
                System.out.println(i);
            }
        }
    }
}

