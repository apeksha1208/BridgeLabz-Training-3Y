import java.util.Scanner;

public class StringTrimmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading/trailing spaces: ");
        String text = scanner.nextLine();

        // Call user-defined trim method
        int[] trimIndexes = findTrimIndexes(text);
        String userDefinedTrimmed = createSubstring(text, trimIndexes[0], trimIndexes[1]);

        // Call built-in trim method
        String builtInTrimmed = text.trim();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nString Trimming Results:");
        System.out.println("Original string: '" + text + "'");
        System.out.println("User-defined trimmed: '" + userDefinedTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are they equal? " + areEqual);

        scanner.close();
    }

    // Method to trim leading and trailing spaces and return start/end points
    public static int[] findTrimIndexes(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;

        // Find start index (first non-space character)
        while (startIndex <= endIndex && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Find end index (last non-space character)
        while (endIndex >= startIndex && text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        return new int[] { startIndex, endIndex + 1 };
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
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
