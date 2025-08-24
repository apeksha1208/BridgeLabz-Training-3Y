import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0)");
            scanner.close();
            return;
        }

        // Create arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Using for loop, iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Odd number
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print the odd numbers array
        System.out.println("\nOdd numbers from 1 to " + number + ":");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddIndex - 1) {
                System.out.print(", ");
            }
        }

        // Print the even numbers array
        System.out.println("\n\nEven numbers from 1 to " + number + ":");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i]);
            if (i < evenIndex - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        scanner.close();
    }
}
