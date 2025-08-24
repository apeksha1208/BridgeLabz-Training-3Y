import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String text = scanner.nextLine();

        // Check palindrome using three different methods
        boolean result1 = isPalindromeLogic1(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeLogic3(text);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Original string: " + text);
        System.out.println("Logic 1 (Two-pointer): " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Reverse comparison): " + (result3 ? "Palindrome" : "Not Palindrome"));

        if (result1 && result2 && result3) {
            System.out.println("\nAll methods confirm: IT IS A PALINDROME!");
        } else {
            System.out.println("\nAll methods confirm: IT IS NOT A PALINDROME!");
        }

        scanner.close();
    }

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if start >= end, return true
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call with start incremented and end decremented
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse string and compare
    public static boolean isPalindromeLogic3(String text) {
        // Create character array using toCharArray()
        char[] original = text.toCharArray();

        // Create reverse array
        char[] reverse = reverseString(text).toCharArray();

        // Compare original and reverse arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt()
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }
}
