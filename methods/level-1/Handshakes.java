import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The number of possible handshakes is: " + maxHandshakes);

        scanner.close();
    }
}
