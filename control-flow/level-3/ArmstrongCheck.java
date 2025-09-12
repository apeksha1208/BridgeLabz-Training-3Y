import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int originalNumber = Math.abs(number);
        int temp = originalNumber;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit; // per hint: sum of cubes
            temp /= 10;
        }
        boolean isArmstrong = (sum == originalNumber);
        System.out.println(number + (isArmstrong ? " is an Armstrong Number" : " is Not an Armstrong Number"));
        input.close();
    }
}
