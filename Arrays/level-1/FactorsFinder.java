import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array needs to be resized
                if (index >= maxFactor) {
                    // Resize the array
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    // Copy elements from factors array to temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign temp array to factors array
                    factors = temp;
                }

                // Add factor to array
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nTotal number of factors: " + index);

        scanner.close();
    }
}
