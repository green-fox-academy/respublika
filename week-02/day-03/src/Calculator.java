import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println(calculate());
    }
    private static int calculate() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please type in the expression:");
        String input=scanner.nextLine();
        String elements[]=input.split("\\s+");
        int num1 = Integer.parseInt(elements[1]);
        int num2 = Integer.parseInt(elements[2]);
        int result=0;
        if (elements[0].equals("+")) {result=num1+num2;}
        if (elements[0].equals("-")) {result=num1-num2;}
        if (elements[0].equals("*")) {result=num1*num2;}
        if (elements[0].equals("/")) {result=num1/num2;}
        if (elements[0].equals("%")) {result=num1%num2;}
        return result;
    }


}