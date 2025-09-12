import java.util.Scanner;

public class VowelConsonantAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call method to find character types
        String[][] characterTypes = findCharacterTypes(text);

        // Display results in tabular format
        System.out.println("\nCharacter Type Analysis:");
        displayTable(characterTypes);

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

    // Method to find character types and return 2D array
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); // Character
            result[i][1] = checkCharacterType(ch); // Type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("---------\t----");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s\t%s\n", data[i][0], data[i][1]);
        }
    }
}
