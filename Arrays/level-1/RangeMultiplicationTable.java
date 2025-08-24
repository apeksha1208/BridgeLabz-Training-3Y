import java.util.Scanner;

public class RangeMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table (6 to 9): ");
        int number = scanner.nextInt();

        // Define array to store multiplication results
        int[] multiplicationResult = new int[4]; // 6, 7, 8, 9

        // Using for loop, find multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the results
        System.out.println("\nMultiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
