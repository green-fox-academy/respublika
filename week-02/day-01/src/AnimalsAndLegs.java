
import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter number of chickens:");
        String chicken = in1.nextLine();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter number of pigs:");
        String pigs = in2.nextLine();
        int legs=(Integer.parseInt(chicken)*2)+(Integer.parseInt(pigs)*4);
        System.out.println("Number of animal legs in the farm: "+legs);
    }
}
