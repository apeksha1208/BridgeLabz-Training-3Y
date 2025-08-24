import java.util.Scanner;

public class WordLengthAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner nextLine() method
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        // Call user-defined method to split text
        String[] words = splitText(text);

        // Call method to create 2D array with words and lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display results in tabular format
        System.out.println("\nWord Length Analysis:");
        System.out.println("Word\t\tLength");
        System.out.println("----\t\t------");

        for (int i = 0; i < wordLengthArray.length; i++) {
            // Convert length value from String to Integer for display
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.printf("%-15s\t%d\n", wordLengthArray[i][0], length);
        }

        scanner.close();
    }

    // Method to split text into words using charAt() method
    public static String[] splitText(String text) {
        int length = findStringLength(text);

        // Count the number of words in the text
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Add 1 for the last word

        // Create array to store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }

        // Create array to store words
        String[] words = new String[wordCount];

        // Extract words using indexes
        int startIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            int endIndex;
            if (i == wordCount - 1) {
                endIndex = length;
            } else {
                endIndex = spaceIndexes[i];
            }

            // Extract word using charAt()
            StringBuilder word = new StringBuilder();
            for (int j = startIndex; j < endIndex; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            startIndex = endIndex + 1;
        }

        return words;
    }

    // Method to find and return string's length without using length() method
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

    // Method to take word array and return 2D String array of word and its length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(findStringLength(words[i])); // Length as String
        }

        return result;
    }
}
