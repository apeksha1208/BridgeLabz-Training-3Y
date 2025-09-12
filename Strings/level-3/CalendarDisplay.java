import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display calendar
        displayCalendar(month, year);

        scanner.close();
    }

    // Method to get name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
    }

    // Method to check if year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        System.out.println("--- --- --- --- --- --- ---");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // First for loop: display spaces for proper indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second for loop: display days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Add newline if calendar doesn't end on Saturday
        if ((firstDay + daysInMonth) % 7 != 0) {
            System.out.println();
        }
    }
}
