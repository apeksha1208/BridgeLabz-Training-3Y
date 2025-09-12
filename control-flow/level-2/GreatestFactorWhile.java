import java.util.Scanner;

public class GreatestFactorWhile {
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
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor besides itself is " + greatestFactor);
        input.close();
    }
}
