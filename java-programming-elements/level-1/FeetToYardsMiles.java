import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();
        double yards = distanceFeet / 3.0; // 1 yard = 3 feet
        double miles = yards / 1760.0; // 1 mile = 1760 yards
        System.out.println("The distance is " + String.format("%.2f", distanceFeet) + " feet, which is " + String.format("%.2f", yards) + " yards and " + String.format("%.4f", miles) + " miles");
        input.close();
    }
}


