import java.util.Scanner;

public class BMICalculatorAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight and height for 10 persons
        double[][] personData = new double[10][2]; // [person][weight, height]

        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMIAndStatus(personData);

        // Display results
        displayBMITable(personData, bmiResults);

        scanner.close();
    }

    // Method to find BMI and status of every person
    public static String[][] calculateBMIAndStatus(double[][] personData) {
        String[][] results = new String[personData.length][2]; // [person][BMI, Status]

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];

            // Convert cm to meters
            double heightM = heightCm / 100.0;

            // Calculate BMI
            double bmi = weight / (heightM * heightM);

            // Determine status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            results[i][0] = String.format("%.2f", bmi);
            results[i][1] = status;
        }

        return results;
    }

    // Method to display 2D string array in tabular format
    public static void displayBMITable(double[][] personData, String[][] bmiResults) {
        System.out.println("\n=== BMI Analysis Results ===");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------\t----------\t----------\t---\t\t------");

        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%s\t%s\n",
                    (i + 1), personData[i][1], personData[i][0], bmiResults[i][0], bmiResults[i][1]);
        }
    }
}
