// Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it

import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter kilometer:");
        String km = in.nextLine();
        double miles= Integer.parseInt(km) * 0.62137;
        System.out.println(km+" km is "+miles+" miles.");
    }
}
