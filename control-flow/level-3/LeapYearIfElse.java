import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("The Year " + year + " is Not a Leap Year (invalid for Gregorian calendar)");
        } else if (year % 400 == 0) {
            System.out.println("The Year " + year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("The Year " + year + " is Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("The Year " + year + " is a Leap Year");
        } else {
            System.out.println("The Year " + year + " is Not a Leap Year");
        }
        input.close();
    }
}
