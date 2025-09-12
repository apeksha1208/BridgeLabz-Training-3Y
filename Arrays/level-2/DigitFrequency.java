import java.util.Scanner;

public class DigitFrequency {
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

        // Define frequency array of size 10
        int[] frequency = new int[10];

        // Loop through digits array and increase frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // Display the original number
        System.out.println("Original number: " + number);

        // Display digits array
        System.out.print("Digits in the number: ");
        for (int i = digitCount - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }

        // Display frequency of each digit
        System.out.println("\n\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
