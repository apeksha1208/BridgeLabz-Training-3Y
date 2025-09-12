import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println("Greatest factor besides itself is 1");
            input.close();
            return;
        }
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor besides itself is " + greatestFactor);
        input.close();
    }
}
