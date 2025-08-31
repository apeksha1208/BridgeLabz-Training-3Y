import java.util.Scanner;

public class TriangularPark {

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000; // 5km = 5000 meters
        return (int) Math.ceil(distanceInMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of triangle (in meters): ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds + " rounds to finish 5km run.");

        scanner.close();
    }
}
