import java.util.Scanner;

public class LeapYear {
    
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4 and not divisible by 100 or divisible by 400
        if (year < 1582) {
            return false; // Gregorian calendar started in 1582
        }
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (year < 1582) {
            System.out.println("Year " + year + " is not a Leap Year (Gregorian calendar started in 1582)");
        } else if (isLeapYear(year)) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
        
        scanner.close();
    }
}
