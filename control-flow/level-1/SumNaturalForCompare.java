import java.util.Scanner;

public class SumNaturalForCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = input.nextLong();
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            input.close();
            return;
        }

        long formulaSum = n * (n + 1) / 2;
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        boolean match = (sum == formulaSum);
        System.out.println("Sum by formula = " + formulaSum + ", Sum by for-loop = " + sum + ", Match = " + match);
        input.close();
    }
}
