import java.util.Scanner;

public class OddEvenRangeL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number");
            input.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        input.close();
    }
}
