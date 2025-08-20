import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            input.close();
            return;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        input.close();
    }
}
