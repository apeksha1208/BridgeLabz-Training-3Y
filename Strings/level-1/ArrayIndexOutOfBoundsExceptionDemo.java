import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ArrayIndexOutOfBoundsException Demonstration ===\n");

        // Define a variable of array of names and take input from user
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };

        System.out.println("Array of names: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Index " + i + ": " + names[i]);
        }

        // First call method to generate exception
        System.out.println("\n1. Calling method to generate ArrayIndexOutOfBoundsException:");
        generateArrayIndexOutOfBoundsException(names);

        System.out.println("\n2. Calling method to handle ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);

        scanner.close();
    }

    // Method to generate the Exception
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Access index larger than the length of the array
        System.out.println("Attempting to access element at index " + (names.length + 2) + "...");
        String name = names[names.length + 2]; // This will throw ArrayIndexOutOfBoundsException
        System.out.println("Name: " + name); // This line will never execute
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException handling
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        // Try-catch block for Exception while accessing array
        try {
            System.out.println("Attempting to access element at index " + (names.length + 2) + "...");
            String name = names[names.length + 2]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Name: " + name); // This line will never execute
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("The index is out of bounds for the array length.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
