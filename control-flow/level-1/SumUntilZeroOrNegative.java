import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (stop on 0 or negative): ");
            double value = input.nextDouble();
            if (value <= 0.0) {
                break;
            }
            total += value;
        }
        System.out.println("Total = " + String.format("%.2f", total));
        input.close();
    }
}


