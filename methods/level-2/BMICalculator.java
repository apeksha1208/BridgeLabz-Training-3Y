import java.util.Scanner;

public class BMICalculator {
    
    public static void calculateBMI(double[][] teamData) {
        for (int i = 0; i < teamData.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = teamData[i][1] / 100.0;
            // Calculate BMI: weight / (height * height) in kg/m^2
            teamData[i][2] = teamData[i][0] / (heightInMeters * heightInMeters);
        }
    }
    
    public static String[] determineBMIStatus(double[][] teamData) {
        String[] status = new String[teamData.length];
        
        for (int i = 0; i < teamData.length; i++) {
            double bmi = teamData[i][2];
            
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        return status;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2D array: 10 rows, 3 columns (weight, height, BMI)
        double[][] teamData = new double[10][3];
        
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        
        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }
        
        // Calculate BMI for all persons
        calculateBMI(teamData);
        
        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(teamData);
        
        // Display results
        System.out.println("\nBMI Analysis Results:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("------\t----------\t----------\t---\t\t------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d\t%.1f\t\t%.1f\t\t%.2f\t\t%s%n", 
                             (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }
        
        scanner.close();
    }
}
