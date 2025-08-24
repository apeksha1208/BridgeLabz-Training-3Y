import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to save salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Define arrays to save new salary and bonus amount
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Variables to save totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");

        // Loop to take input from user
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Employee " + (i + 1) + " - Enter salary: ");
                salary[i] = scanner.nextDouble();

                System.out.print("Employee " + (i + 1) + " - Enter years of service: ");
                yearsOfService[i] = scanner.nextDouble();

                // Check if salary or year of service is invalid
                if (salary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input! Please enter positive values.");
                    i--; // Decrement index counter
                    validInput = true; // Continue to next iteration
                } else {
                    validInput = true;
                }
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");
        System.out.println("Employee\tOld Salary\tYears\tBonus\tNew Salary");
        System.out.println("--------\t----------\t-----\t-----\t----------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.1f\t%.2f\t%.2f\n",
                    (i + 1), salary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nSummary:");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
