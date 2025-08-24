import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for string and indices
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        // Create substring using user-defined method
        String userDefinedSubstring = createSubstring(text, startIndex, endIndex);

        // Create substring using built-in method
        String builtInSubstring = text.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean areEqual = compareStrings(userDefinedSubstring, builtInSubstring);

        // Display results
        System.out.println("\nSubstring Results:");
        System.out.println("Original string: " + text);
        System.out.println("User-defined substring: " + userDefinedSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are they equal? " + areEqual);

        scanner.close();
    }

    // Method to create substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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
