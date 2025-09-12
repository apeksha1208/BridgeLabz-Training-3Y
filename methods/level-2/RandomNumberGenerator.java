import java.util.Scanner;

public class RandomNumberGenerator {
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999 (4 digits)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        
        return numbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) {
            return new double[0];
        }
        
        // Find minimum and maximum
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            sum += number;
        }
        
        // Calculate average
        double average = (double) sum / numbers.length;
        
        return new double[]{average, min, max};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of 4-digit random numbers to generate: ");
        int size = scanner.nextInt();
        
        if (size > 0) {
            // Generate 4-digit random numbers
            int[] randomNumbers = generate4DigitRandomArray(size);
            
            System.out.println("\nGenerated " + size + " random 4-digit numbers:");
            for (int i = 0; i < randomNumbers.length; i++) {
                System.out.print(randomNumbers[i]);
                if (i < randomNumbers.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            
            // Find average, minimum, and maximum
            double[] results = findAverageMinMax(randomNumbers);
            
            System.out.println("\nResults:");
            System.out.printf("Average: %.2f%n", results[0]);
            System.out.println("Minimum: " + (int) results[1]);
            System.out.println("Maximum: " + (int) results[2]);
        } else {
            System.out.println("Please enter a positive number.");
        }
        
        scanner.close();
    }
}
