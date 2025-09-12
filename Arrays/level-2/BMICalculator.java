import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            weight[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Analysis Results:");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------\t---------\t----------\t---\t\t------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1), height[i], weight[i], bmi[i], weightStatus[i]);
        }

        scanner.close();
    }
}
