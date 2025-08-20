import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weightKg = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        String status;
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 24.9)
            status = "Normal weight";
        else if (bmi < 29.9)
            status = "Overweight";
        else
            status = "Obesity";

        System.out.println("BMI = " + String.format("%.2f", bmi) + " (" + status + ")");
        sc.close();
    }
}
