
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;
public class AverageOfInput{
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=5;i++){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number:");
            String n = in.nextLine();
            sum+=Integer.parseInt(n);
        }
        double avg=sum/5;
        System.out.println("Sum: "+sum+", Average: "+avg);
    }
}
