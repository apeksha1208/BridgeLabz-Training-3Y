import java.util.Scanner;

public class LowercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner nextLine() method
        System.out.print("Enter complete text: ");
        String text = scanner.nextLine();

        // Convert using user-defined method
        String userDefinedLowercase = convertToLowercase(text);

        // Convert using built-in method
        String builtInLowercase = text.toLowerCase();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedLowercase, builtInLowercase);

        // Display results
        System.out.println("\nLowercase Conversion Results:");
        System.out.println("Original text: " + text);
        System.out.println("User-defined lowercase: " + userDefinedLowercase);
        System.out.println("Built-in lowercase: " + builtInLowercase);
        System.out.println("Are they equal? " + areEqual);

        scanner.close();
    }

    // Method using charAt() to convert each character to lowercase
    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if character is uppercase (ASCII value 65-90)
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase by adding 32 (ASCII difference)
                result.append((char) (currentChar + 32));
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
