import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== StringIndexOutOfBoundsException Demonstration ===\n");

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("String: " + text + " (length: " + text.length() + ")");

        // First call method to generate exception
        System.out.println("\n1. Calling method to generate StringIndexOutOfBoundsException:");
        generateStringIndexOutOfBoundsException(text);

        System.out.println("\n2. Calling method to handle StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(text);

        scanner.close();
    }

    // Method to generate the Exception
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Access index using charAt() beyond the length of the String
        System.out.println("Attempting to access character at index " + (text.length() + 1) + "...");
        char character = text.charAt(text.length() + 1); // This will throw StringIndexOutOfBoundsException
        System.out.println("Character: " + character); // This line will never execute
    }

    // Method to demonstrate StringIndexOutOfBoundsException handling
    public static void handleStringIndexOutOfBoundsException(String text) {
        // Try-catch block for Exception while accessing the String method
        try {
            System.out.println("Attempting to access character at index " + (text.length() + 1) + "...");
            char character = text.charAt(text.length() + 1); // This will throw StringIndexOutOfBoundsException
            System.out.println("Character: " + character); // This line will never execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("The index is out of bounds for the string length.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
