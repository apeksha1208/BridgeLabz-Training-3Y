import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter kilometers: ");
        km = input.nextInt();
        double miles = km / 1.6; // 1 mile = 1.6 km => miles = km / 1.6
        System.out.println("The total miles is " + String.format("%.2f", miles) + " mile for the given " + String.format("%.2f", km) + " km");
        input.close();
    }
}


