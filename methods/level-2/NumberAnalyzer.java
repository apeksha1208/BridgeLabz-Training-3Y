import java.util.Scanner;

public class NumberAnalyzer {
    
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        
        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nAnalysis of each number:");
        System.out.println("Number\tPositive/Negative\tEven/Odd");
        System.out.println("------\t------------------\t--------");
        
        // Loop through the array using length
        for (int i = 0; i < numbers.length; i++) {
            String posNeg = isPositive(numbers[i]) ? "Positive" : "Negative";
            String evenOdd = "";
            
            if (isPositive(numbers[i])) {
                evenOdd = isEven(numbers[i]) ? "Even" : "Odd";
            } else {
                evenOdd = "N/A";
            }
            
            System.out.println(numbers[i] + "\t" + posNeg + "\t\t" + evenOdd);
        }
        
        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        
        System.out.println("\nComparison of first and last elements:");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
        switch (comparison) {
            case 1:
                System.out.println("First element is greater than last element");
                break;
            case 0:
                System.out.println("First and last elements are equal");
                break;
            case -1:
                System.out.println("First element is less than last element");
                break;
        }
        
        scanner.close();
    }
}
