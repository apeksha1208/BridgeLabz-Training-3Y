import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call method to find vowels and consonants count
        int[] counts = findVowelConsonantCount(text);

        // Display results
        System.out.println("\nVowel and Consonant Analysis:");
        System.out.println("String: " + text);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Other characters: " + counts[2]);

        scanner.close();
    }

    // Method to check if character is vowel or consonant
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants count
    public static int[] findVowelConsonantCount(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        int otherCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);

            switch (type) {
                case "Vowel":
                    vowelCount++;
                    break;
                case "Consonant":
                    consonantCount++;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }

        return new int[] { vowelCount, consonantCount, otherCount };
    }
}
