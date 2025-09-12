import java.util.Scanner;

public class DigitAnalysisDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Create array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Use loop to iterate until number is not equal to 0
        while (number != 0) {
            // Remove last digit and add to array
            digits[index] = (int) (number % 10);
            number = number / 10;
            index++;

            // If index equals maxDigit, increase array size
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy from current digits array to temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign temp array to digits array
                digits = temp;
            }
        }

        // Variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        // Loop through array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("\nDigits in the number:");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nAnalysis:");
        System.out.println("Total digits: " + index);
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
