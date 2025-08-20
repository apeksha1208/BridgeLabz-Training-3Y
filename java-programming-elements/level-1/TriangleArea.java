import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();
        double areaInches2 = 0.5 * base * height;
        double areaCm2 = areaInches2 * 6.4516; // 1 inch^2 = 6.4516 cm^2
        System.out.println("The area of triangle is " + String.format("%.2f", areaInches2) + " square inches and " + String.format("%.2f", areaCm2) + " square centimeters");
        input.close();
    }
}


