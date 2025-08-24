import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for text
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Call user-defined method
        char[] userDefinedChars = getCharacters(text);

        // Call built-in method
        char[] builtInChars = text.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display results
        System.out.println("\nCharacter Array Results:");
        System.out.println("Original string: " + text);

        System.out.print("User-defined characters: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in characters: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre they equal? " + areEqual);

        scanner.close();
    }

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    // Method to compare two char arrays and return boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        // Check if lengths are different
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
