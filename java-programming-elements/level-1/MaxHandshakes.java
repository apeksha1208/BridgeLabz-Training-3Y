import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        long n = input.nextLong();
        long handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes possible is " + handshakes);
        input.close();
    }
}


