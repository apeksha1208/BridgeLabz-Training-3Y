import java.util.Scanner;

public class SumNaturalWhileCompare {
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
        long i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        boolean match = (sum == formulaSum);
        System.out.println("Sum by formula = " + formulaSum + ", Sum by while-loop = " + sum + ", Match = " + match);
        input.close();
    }
}
