import java.util.Scanner;



public class Problem1 {

    public static double calculator(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Cannot divide by zero.");
                    return 0;
                }
            default:
                System.out.println("Invalid operation.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        double result = calculator(a, b, operation);
        System.out.println("Result: " + result);
    }
}

