import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create 2D array to store marks and arrays for percentages and grades
        int[][] marks = new int[numberOfStudents][3]; // [student][subject]
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        String[] subjects = { "Physics", "Chemistry", "Maths" };

        // Take input for marks using 2D array
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                // Input validation for marks
                do {
                    System.out.print("Enter marks in " + subjects[j] + ": ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Please enter positive values for marks.");
                        i--; // Decrement index
                        break;
                    }
                } while (marks[i][j] < 0);

                if (marks[i][j] < 0)
                    break; // Break inner loop if invalid
            }

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                continue; // Skip to next iteration if any mark is invalid
            }
        }

        // Calculate percentage and grade using 2D array
        for (int i = 0; i < numberOfStudents; i++) {
            if (marks[i][0] >= 0 && marks[i][1] >= 0 && marks[i][2] >= 0) {
                percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

                // Determine grade based on percentage
                if (percentages[i] >= 90) {
                    grades[i] = "A+";
                } else if (percentages[i] >= 80) {
                    grades[i] = "A";
                } else if (percentages[i] >= 70) {
                    grades[i] = "B";
                } else if (percentages[i] >= 60) {
                    grades[i] = "C";
                } else if (percentages[i] >= 50) {
                    grades[i] = "D";
                } else {
                    grades[i] = "F";
                }
            }
        }

        // Display results
        System.out.println("\nStudent Results (2D Array):");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("-------\t-------\t---------\t-----\t----------\t-----");

        for (int i = 0; i < numberOfStudents; i++) {
            if (marks[i][0] >= 0 && marks[i][1] >= 0 && marks[i][2] >= 0) {
                System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
            }
        }

        scanner.close();
    }
}
