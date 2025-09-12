import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create array of 10 elements and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (enter 0 or negative to stop, max 10 numbers):");

        // Infinite while loop
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            // Check if user entered 0 or negative number
            if (input <= 0) {
                break;
            }

            // Check if array is full
            if (index >= 10) {
                System.out.println("Array is full (maximum 10 numbers)");
                break;
            }

            // Store the number in array and increment index
            numbers[index] = input;
            index++;
        }

        System.out.println("\nAll numbers entered:");

        // Loop to get values and add to total
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("\nSum of all numbers: " + total);

        scanner.close();
    }
}
