import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store age and height for 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        String[] names = { "Amar", "Akbar", "Anthony" };

        System.out.println("Enter age and height for 3 friends:");

        // Take user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height for " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nFriends Information:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " - Age: " + ages[i] + ", Height: " + heights[i] + " cm");
        }

        System.out.println("\nResults:");
        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}
