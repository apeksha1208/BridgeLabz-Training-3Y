import java.util.Scanner;

public class Quadratic {
    
    public static double[] findRoots(double a, double b, double c) {
        // Calculate discriminant: delta = b^2 - 4*a*c
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (complex roots)
            return new double[0]; // Return empty array
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quadratic Equation: ax^2 + bx + c = 0");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero (not a quadratic equation)");
        } else {
            double[] roots = findRoots(a, b, c);
            
            System.out.println("\nEquation: " + a + "x^2 + " + b + "x + " + c + " = 0");
            
            if (roots.length == 0) {
                System.out.println("No real roots exist (complex roots)");
            } else if (roots.length == 1) {
                System.out.println("One real root: x = " + roots[0]);
            } else {
                System.out.println("Two real roots:");
                System.out.println("x1 = " + roots[0]);
                System.out.println("x2 = " + roots[1]);
            }
        }
        
        scanner.close();
    }
}
