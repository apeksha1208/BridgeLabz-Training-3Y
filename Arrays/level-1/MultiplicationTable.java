import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int number = scanner.nextInt();

        // Define array to store multiplication results
        int[] multiplicationTable = new int[10];

        // Run loop from 1 to 10 and store results in array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        scanner.close();
    }
}
