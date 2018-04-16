import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the favorite number:");
        int favorite_number = input.nextInt();;
        System.out.println("My favorite number is: "+favorite_number);
    }
}
