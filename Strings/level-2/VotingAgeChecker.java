import java.util.Scanner;

public class VotingAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // Display results
        System.out.println("\nVoting Eligibility Results:");
        displayTable(votingResults);

        scanner.close();
    }

    // Method to generate random 2-digit ages
    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]); // Age

            // Validate age for negative number
            if (ages[i] < 0) {
                results[i][1] = "false"; // Cannot vote
            } else if (ages[i] >= 18) {
                results[i][1] = "true"; // Can vote
            } else {
                results[i][1] = "false"; // Cannot vote
            }
        }

        return results;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Student\tAge\tCan Vote");
        System.out.println("-------\t---\t--------");

        for (int i = 0; i < data.length; i++) {
            String canVote = data[i][1].equals("true") ? "Yes" : "No";
            System.out.printf("%d\t%s\t%s\n", (i + 1), data[i][0], canVote);
        }
    }
}
