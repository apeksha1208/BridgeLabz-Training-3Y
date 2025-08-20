import java.util.Scanner;

public class TriangleAreaCmIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / 6.4516; // 1 in^2 = 6.4516 cm^2

        System.out.println("The Area of the triangle in sq in is " + String.format("%.4f", areaIn2)
                + " and sq cm is " + String.format("%.4f", areaCm2));

        input.close();
    }
}
