import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus = 0.0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("Bonus amount is INR " + String.format("%.2f", bonus));
        input.close();
    }
}
