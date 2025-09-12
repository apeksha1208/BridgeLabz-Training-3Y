import java.util.Scanner;

public class CharacterFrequencyWithUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies using unique characters
        String[][] frequencies = findCharacterFrequencyWithUnique(text);

        // Display results
        System.out.println("\nCharacter Frequency Analysis (Using Unique Characters):");
        System.out.println("Original string: " + text);
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < frequencies.length; i++) {
            System.out.printf("%s\t\t%s\n", frequencies[i][0], frequencies[i][1]);
        }

        scanner.close();
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        // Use nested loops to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // Create new array with exact size
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findCharacterFrequencyWithUnique(String text) {
        // Create array to store frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];

        // Loop through text to find frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Call uniqueCharacters method to find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create 2D String array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through unique characters and store frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }
}
