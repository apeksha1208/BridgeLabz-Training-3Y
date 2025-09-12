import java.util.Scanner;

public class UniqueCharactersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display results
        System.out.println("\nUnique Characters Analysis:");
        System.out.println("Original string: " + text);
        System.out.println("String length: " + findStringLength(text));
        System.out.print("Unique characters: ");

        for (int i = 0; i < uniqueChars.length; i++) {
            if (uniqueChars[i] != '\0') {
                System.out.print(uniqueChars[i] + " ");
            }
        }

        System.out.println("\nTotal unique characters: " + countUniqueCharacters(uniqueChars));

        scanner.close();
    }

    // Method to find the length of text without using String method length()
    public static int findStringLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);

        // Create array to store unique characters (size is length of text)
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        // Loop to find unique characters using nested loop
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if character is unique
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, store it
            if (isUnique) {
                uniqueChars[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Create new array with exact size for unique characters
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Helper method to count non-null characters
    public static int countUniqueCharacters(char[] chars) {
        int count = 0;
        for (char c : chars) {
            if (c != '\0') {
                count++;
            }
        }
        return count;
    }
}
