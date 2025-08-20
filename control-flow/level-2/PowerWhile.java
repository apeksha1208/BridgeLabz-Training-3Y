import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (integer): ");
        int number = input.nextInt();
        System.out.print("Enter power (non-negative integer): ");
        int power = input.nextInt();
        if (power < 0) {
            System.out.println("Power must be non-negative.");
            input.close();
            return;
        }
        long result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
