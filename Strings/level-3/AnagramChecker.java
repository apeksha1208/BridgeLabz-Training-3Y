import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String text2 = scanner.nextLine();

        // Check if texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display results
        System.out.println("\nAnagram Check Results:");
        System.out.println("First string: " + text1);
        System.out.println("Second string: " + text2);
        System.out.println("Are anagrams? " + (result ? "Yes" : "No"));

        if (result) {
            System.out.println("The strings are anagrams!");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store frequency of characters for both texts
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            frequency1[ch]++;
        }

        // Find frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            frequency2[ch]++;
        }

        // Compare frequency of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }
}
