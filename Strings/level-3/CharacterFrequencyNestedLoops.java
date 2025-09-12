import java.util.Scanner;

public class CharacterFrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies using nested loops
        String[] frequencies = findCharacterFrequencyNestedLoops(text);

        // Display results
        System.out.println("\nCharacter Frequency Analysis (Using Nested Loops):");
        System.out.println("Original string: " + text);
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] != null) {
                System.out.println(frequencies[i]);
            }
        }

        scanner.close();
    }

    // Method to find frequency of characters using nested loops
    public static String[] findCharacterFrequencyNestedLoops(String text) {
        // Create array to store frequency of each character
        int[] frequency = new int[text.length()];

        // Create array to store characters using toCharArray()
        char[] chars = text.toCharArray();

        // Nested loop to find frequency of each character
        for (int i = 0; i < chars.length; i++) {
            // Initialize frequency to 1
            frequency[i] = 1;

            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    // Set duplicate characters to '0' to avoid counting again
                    chars[j] = '0';
                }
            }
        }

        // Create 1D String array to store characters and their frequencies
        String[] result = new String[text.length()];
        int index = 0;

        // Iterate through characters and store frequencies
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') {
                result[index] = chars[i] + "\t\t" + frequency[i];
                index++;
            }
        }

        return result;
    }
}
