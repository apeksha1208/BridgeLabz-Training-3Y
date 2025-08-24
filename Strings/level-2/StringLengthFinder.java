import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner next() method
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Call user-defined method
        int userDefinedLength = findStringLength(text);

        // Call built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nString Length Results:");
        System.out.println("Original string: " + text);
        System.out.println("User-defined length: " + userDefinedLength);
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("Are they equal? " + (userDefinedLength == builtInLength));

        scanner.close();
    }

    // Method to find and return string's length without using built-in length()
    // method
    public static int findStringLength(String text) {
        int count = 0;

        // Use infinite loop to count each character
        while (true) {
            try {
                // Try to access character at current index
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                // Handle the exception and return the count
                break;
            }
        }

        return count;
    }
}
