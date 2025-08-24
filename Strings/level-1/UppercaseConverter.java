import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner nextLine() method
        System.out.print("Enter complete text: ");
        String text = scanner.nextLine();

        // Convert using user-defined method
        String userDefinedUppercase = convertToUppercase(text);

        // Convert using built-in method
        String builtInUppercase = text.toUpperCase();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedUppercase, builtInUppercase);

        // Display results
        System.out.println("\nUppercase Conversion Results:");
        System.out.println("Original text: " + text);
        System.out.println("User-defined uppercase: " + userDefinedUppercase);
        System.out.println("Built-in uppercase: " + builtInUppercase);
        System.out.println("Are they equal? " + areEqual);

        scanner.close();
    }

    // Method using charAt() to convert each character to uppercase
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if character is lowercase (ASCII value 97-122)
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by subtracting 32 (ASCII difference)
                result.append((char) (currentChar - 32));
            } else {
                // Keep other characters as they are
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
