import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for 2 String variables
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Compare using user-defined method
        boolean userDefinedResult = compareStrings(str1, str2);

        // Compare using built-in method
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("\nComparison Results:");
        System.out.println("User-defined method result: " + userDefinedResult);
        System.out.println("Built-in equals() method result: " + builtInResult);

        // Check if results are the same
        if (userDefinedResult == builtInResult) {
            System.out.println("Both methods returned the same result!");
        } else {
            System.out.println("Methods returned different results!");
        }

        scanner.close();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
