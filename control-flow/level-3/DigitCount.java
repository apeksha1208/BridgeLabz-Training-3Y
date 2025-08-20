import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        long temp = Math.abs(number);
        if (temp == 0) {
            System.out.println("Number of digits: 1");
            input.close();
            return;
        }
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        input.close();
    }
}
