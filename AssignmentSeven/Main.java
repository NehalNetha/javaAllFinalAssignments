import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean exit = false;

      while (!exit) {
          System.out.println("Calculator Menu:");
          System.out.println("1. Addition");
          System.out.println("2. Subtraction");
          System.out.println("3. Multiplication");
          System.out.println("4. Division");
          System.out.println("5. Exit");
          System.out.print("Enter your choice: ");

          int choice = scanner.nextInt();

          switch (choice) {
              case 1:
                  Addition.add();
                  break;
              case 2:
                  Subtraction.subtract();
                  break;
              case 3:
                  Multiplication.multiply();
                  break;
              case 4:
                  Division.divide();
                  break;
              case 5:
                  exit = true;
                  System.out.println("Exiting the calculator...");
                  break;
              default:
                  System.out.println("Invalid choice. Please try again.");
          }
      }

      scanner.close();
  }
}