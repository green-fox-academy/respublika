
// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the number of boys:");
        int boys = Integer.parseInt(in1.nextLine());
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter the number of girls:");
        int girls = Integer.parseInt(in2.nextLine());
        int total=boys+girls;
        if (boys==girls && total>20) { System.out.println("The party is exellent!");}
        else if (boys!=girls && total>20) { System.out.println("Quite cool party!");}
        else if (total<20 && girls>0) { System.out.println("Average party...");}
        else if (girls==0) { System.out.println("Sausage party");}
        else { System.out.println("I don’t know.");}
    }
}


