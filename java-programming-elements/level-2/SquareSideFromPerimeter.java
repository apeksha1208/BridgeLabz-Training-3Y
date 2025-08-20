import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + String.format("%.2f", side) + " whose perimeter is "
                + String.format("%.2f", perimeter));
        input.close();
    }
}
