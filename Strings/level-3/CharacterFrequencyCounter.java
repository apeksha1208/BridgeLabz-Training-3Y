import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display results
        System.out.println("\nCharacter Frequency Analysis:");
        System.out.println("Original string: " + text);
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < frequencies.length; i++) {
            System.out.printf("%s\t\t%s\n", frequencies[i][0], frequencies[i][1]);
        }

        scanner.close();
    }

    // Method to find frequency of characters using charAt()
    public static String[][] findCharacterFrequency(String text) {
        // Create array to store frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];

        // Loop through text to find frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count non-zero frequencies
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        // Create array to store characters and their frequencies
        String[][] result = new String[count][2];
        int index = 0;

        // Loop through characters in text and store frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }
}
