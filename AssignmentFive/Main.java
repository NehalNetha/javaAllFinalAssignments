import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a shape to calculate (or enter 'exit' to exit):");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Pyramid");

            String choice = scanner.next().toLowerCase();

            if (choice.equals("exit")) {
                break;
            }

            switch (choice) {
                case "1":
                    processShape(scanner, "Circle", new Circle(getRadius(scanner)));
                    break;
                case "2":
                    processShape(scanner, "Rectangle", new Rectangle(getLength(scanner), getWidth(scanner)));
                    break;
                case "4":
                    processShape(scanner, "Sphere", new Sphere(getRadius(scanner)));
                    break;
                case "5":
                    processShape(scanner, "Cylinder", new Cylinder(getRadius(scanner), getHeight(scanner)));
                    break;
                case "6":
                    processShape(scanner, "Pyramid", new Pyramid(getBaseLength(scanner), getBaseWidth(scanner), getHeight(scanner)));
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }

    private static double getRadius(Scanner scanner) {
        System.out.print("Enter the radius: ");
        return scanner.nextDouble();
    }

    private static double getLength(Scanner scanner) {
        System.out.print("Enter the length: ");
        return scanner.nextDouble();
    }

    private static double getWidth(Scanner scanner) {
        System.out.print("Enter the width: ");
        return scanner.nextDouble();
    }

    private static double getSide(Scanner scanner) {
        System.out.print("Enter the side length: ");
        return scanner.nextDouble();
    }

    private static double getHeight(Scanner scanner) {
        System.out.print("Enter the height: ");
        return scanner.nextDouble();
    }

    private static double getBaseLength(Scanner scanner) {
        System.out.print("Enter the length of the base: ");
        return scanner.nextDouble();
    }

    private static double getBaseWidth(Scanner scanner) {
        System.out.print("Enter the width of the base: ");
        return scanner.nextDouble();
    }

    private static void processShape(Scanner scanner, String shapeName, Shapes shape) {
        shape.showShape(shapeName);
        System.out.println("Area: " + shape.calculateShape());
        System.out.println("Perimeter/Volume: " + (shape instanceof Volume ? ((Volume) shape).calculateVolume() : shape.calculatePerimeter()));
    }
}
