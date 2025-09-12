import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display results
        System.out.println("\nFirst Non-Repeating Character Analysis:");
        System.out.println("Original string: " + text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        scanner.close();
    }

    // Method to find first non-repeating character using charAt()
    public static char findFirstNonRepeatingCharacter(String text) {
        // Create array to store frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];

        // Loop through text to find frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Loop through text to find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }
}
