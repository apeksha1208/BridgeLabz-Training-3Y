import java.util.Scanner;

public class NumberChecker {

    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = checkNumber(number);

        switch (result) {
            case -1:
                System.out.println("The number is negative");
                break;
            case 0:
                System.out.println("The number is zero");
                break;
            case 1:
                System.out.println("The number is positive");
                break;
        }

        scanner.close();
    }
}
