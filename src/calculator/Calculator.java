
package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();

        

        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if ( choice == 3)    {    
            result = num1 * num2;
        } else if (choice == 4) {
            if(num2 != 0)
                result = num1 / num2;
            else
                System.out.println("Cannot divide by zero!");
        } else {
            System.out.println("Invalid operator!");
        }

        System.out.println("Result: " + result);
    }
}

