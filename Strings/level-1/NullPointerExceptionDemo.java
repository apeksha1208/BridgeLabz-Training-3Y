public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Demonstration ===\n");

        // First call method to generate exception
        System.out.println("1. Calling method to generate NullPointerException:");
        generateNullPointerException();

        System.out.println("\n2. Calling method to handle NullPointerException:");
        handleNullPointerException();
    }

    // Method to generate the Exception
    public static void generateNullPointerException() {
        // Define variable text and initialize it to null
        String text = null;

        // Call String method to generate exception
        System.out.println("Attempting to call length() on null string...");
        int length = text.length(); // This will throw NullPointerException
        System.out.println("Length: " + length); // This line will never execute
    }

    // Method to demonstrate NullPointerException handling
    public static void handleNullPointerException() {
        // Define variable text and initialize it to null
        String text = null;

        // Try-catch block for handling the Exception
        try {
            System.out.println("Attempting to call length() on null string...");
            int length = text.length(); // This will throw NullPointerException
            System.out.println("Length: " + length); // This line will never execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("The string is null, cannot call methods on it.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
