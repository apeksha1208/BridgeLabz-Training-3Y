import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== IllegalArgumentException Demonstration ===\n");

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("String: " + text + " (length: " + text.length() + ")");

        // First call method to generate exception
        System.out.println("\n1. Calling method to generate IllegalArgumentException:");
        generateIllegalArgumentException(text);

        System.out.println("\n2. Calling method to handle IllegalArgumentException:");
        handleIllegalArgumentException(text);

        scanner.close();
    }

    // Method to generate the Exception
    public static void generateIllegalArgumentException(String text) {
        // Use subString() and set start index greater than end index
        System.out.println("Attempting to get substring from index 5 to index 2...");
        String substring = text.substring(5, 2); // This will throw IllegalArgumentException
        System.out.println("Substring: " + substring); // This line will never execute
    }

    // Method to demonstrate IllegalArgumentException handling
    public static void handleIllegalArgumentException(String text) {
        // Try-catch block for Exception while using substring()
        try {
            System.out.println("Attempting to get substring from index 5 to index 2...");
            String substring = text.substring(5, 2); // This will throw IllegalArgumentException
            System.out.println("Substring: " + substring); // This line will never execute
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
