import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Find count of digits in the number
        long tempNumber = number;
        int digitCount = 0;

        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Create array to store digits
        int[] digits = new int[digitCount];

        // Find digits and save in array
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber = tempNumber / 10;
        }

        // Create array to store elements in reverse order
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        // Display original number
        System.out.println("Original number: " + number);

        // Display digits array
        System.out.print("Digits array: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i] + " ");
        }

        // Display reversed array
        System.out.print("\nReversed array: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i] + " ");
        }

        // Display reversed number
        System.out.print("\nReversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i]);
        }

        System.out.println();
        scanner.close();
    }
}
