import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the constant c: ");
        double c = scanner.nextDouble();

        // Check if it is a quadratic equation
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions.");
                } else {
                    System.out.println("No solution.");
                }
            } else {
                // Linear equation bx + c = 0
                double root = -c / b;
                System.out.println("Linear equation with one root: " + root);
            }
        } else {
            // Quadratic equation
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Two real and distinct roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real and distinct roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                // One real and repeated root
                double root = -b / (2 * a);
                System.out.println("One real and repeated root: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
            }
        }

    }
}
