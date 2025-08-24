import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create double array for heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter heights of 11 football team players (in meters):");

        // Get input values from user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / 11;

        // Display results
        System.out.println("\nAll player heights:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " meters");
        }

        System.out.println("\nSum of all heights: " + sum + " meters");
        System.out.println("Mean height of the football team: " + meanHeight + " meters");

        scanner.close();
    }
}
