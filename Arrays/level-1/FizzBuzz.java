import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if it's a positive integer
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer");
            scanner.close();
            return;
        }

        // Create String Array to save the results
        String[] results = new String[number + 1]; // +1 because we start from 0

        // Loop from 0 to the number and save results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Loop again to show the results based on index position
        System.out.println("\nFizzBuzz results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}
