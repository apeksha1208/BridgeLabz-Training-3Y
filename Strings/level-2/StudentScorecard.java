import java.util.Scanner;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculate totals, averages, and percentages
        double[][] calculations = calculateResults(scores);

        // Calculate grades
        String[][] grades = calculateGrades(calculations);

        // Display scorecard
        displayScorecard(scores, calculations, grades);

        scanner.close();
    }

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // [student][subject]

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                // Generate random score between 10 and 99
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }

        return scores;
    }

    // Method to calculate total, average, and percentages
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [student][total, average, percentage]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Physics + Chemistry + Math
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // Assuming max score is 100 per subject

            // Round off to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }

        return results;
    }

    // Method to calculate grades based on percentage
    public static String[][] calculateGrades(double[][] calculations) {
        String[][] grades = new String[calculations.length][1];

        for (int i = 0; i < calculations.length; i++) {
            double percentage = calculations[i][2];

            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] calculations, String[][] grades) {
        System.out.println("\n=== STUDENT SCORECARD ===");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------\t-------\t---------\t-----\t-----\t-------\t----------\t-----");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\t\t%s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    calculations[i][0], calculations[i][1], calculations[i][2], grades[i][0]);
        }

        System.out.println("\nGrade Reference:");
        System.out.println("A+ : 90% and above");
        System.out.println("A  : 80% - 89%");
        System.out.println("B  : 70% - 79%");
        System.out.println("C  : 60% - 69%");
        System.out.println("D  : 50% - 59%");
        System.out.println("F  : Below 50%");
    }
}
