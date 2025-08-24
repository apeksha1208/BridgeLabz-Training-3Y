import java.util.Scanner;

public class WordSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using Scanner nextLine() method
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        // Call user-defined method
        String[] userDefinedWords = splitText(text);

        // Call built-in method
        String[] builtInWords = text.split(" ");

        // Compare the two string arrays
        boolean areEqual = compareStringArrays(userDefinedWords, builtInWords);

        // Display results
        System.out.println("\nWord Splitting Results:");
        System.out.println("Original text: " + text);

        System.out.println("\nUser-defined words:");
        for (int i = 0; i < userDefinedWords.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + userDefinedWords[i]);
        }

        System.out.println("\nBuilt-in split words:");
        for (int i = 0; i < builtInWords.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + builtInWords[i]);
        }

        System.out.println("\nAre they equal? " + areEqual);

        scanner.close();
    }

    // Method to find the length of the String without using built-in length()
    // method
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

    // Method to compare two string arrays and return boolean
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}
