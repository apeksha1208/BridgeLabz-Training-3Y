import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NumberFormatException Demonstration ===\n");

        // Define a variable to take user input as a String
        System.out.print("Enter a string (that is not a number): ");
        String text = scanner.next();

        // First call method to generate exception
        System.out.println("\n1. Calling method to generate NumberFormatException:");
        generateNumberFormatException(text);

        System.out.println("\n2. Calling method to handle NumberFormatException:");
        handleNumberFormatException(text);

        scanner.close();
    }

    // Method to generate the Exception
    public static void generateNumberFormatException(String text) {
        // Use Integer.parseInt(text) to extract number from the text
        System.out.println("Attempting to parse '" + text + "' as integer...");
        int number = Integer.parseInt(text); // This will throw NumberFormatException
        System.out.println("Parsed number: " + number); // This line will never execute
    }

    // Method to demonstrate NumberFormatException handling
    public static void handleNumberFormatException(String text) {
        // Try-catch block for Exception while parsing
        try {
            System.out.println("Attempting to parse '" + text + "' as integer...");
            int number = Integer.parseInt(text); // This will throw NumberFormatException
            System.out.println("Parsed number: " + number); // This line will never execute
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
            System.out.println("The string '" + text + "' cannot be converted to a number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
