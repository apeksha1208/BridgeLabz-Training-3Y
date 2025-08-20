import java.util.Scanner;

public class PowerFor {
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
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
