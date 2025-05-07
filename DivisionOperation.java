

import java.util.Scanner;

public class DivisionOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int a = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int b = scanner.nextInt();

        try {
            System.out.println("Division of a and b is: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }

        scanner.close();
    }
}
