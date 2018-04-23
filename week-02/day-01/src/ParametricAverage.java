
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter how many numbers you want:");
        int total=Integer.parseInt(in.nextLine());
        int forSum=0;
        for (int i=1;i<=total;i++) {
            Scanner in2=new Scanner(System.in);
            System.out.println("Enter number"+i+":");
            int number=Integer.parseInt(in2.nextLine());
            forSum+=number;
        }
        double avg=forSum/total;
        System.out.println("Sum: "+forSum+", Average: "+avg);
    }
}

