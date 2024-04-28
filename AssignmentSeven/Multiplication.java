import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplication {
    public static void multiply() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 * num2;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
