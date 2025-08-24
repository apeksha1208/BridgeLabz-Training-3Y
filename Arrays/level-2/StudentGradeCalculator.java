import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Take input for marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            // Input validation for physics marks
            do {
                System.out.print("Enter marks in Physics: ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] < 0) {
                    System.out.println("Please enter positive values for marks.");
                    i--; // Decrement index
                    break;
                }
            } while (physicsMarks[i] < 0);

            if (physicsMarks[i] < 0)
                continue; // Skip to next iteration if invalid

            // Input validation for chemistry marks
            do {
                System.out.print("Enter marks in Chemistry: ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] < 0) {
                    System.out.println("Please enter positive values for marks.");
                    i--; // Decrement index
                    break;
                }
            } while (chemistryMarks[i] < 0);

            if (chemistryMarks[i] < 0)
                continue; // Skip to next iteration if invalid

            // Input validation for maths marks
            do {
                System.out.print("Enter marks in Maths: ");
                mathsMarks[i] = scanner.nextInt();
                if (mathsMarks[i] < 0) {
                    System.out.println("Please enter positive values for marks.");
                    i--; // Decrement index
                    break;
                }
            } while (mathsMarks[i] < 0);

            if (mathsMarks[i] < 0)
                continue; // Skip to next iteration if invalid
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            if (physicsMarks[i] >= 0 && chemistryMarks[i] >= 0 && mathsMarks[i] >= 0) {
                percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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
        System.out.println("\nStudent Results:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("-------\t-------\t---------\t-----\t----------\t-----");

        for (int i = 0; i < numberOfStudents; i++) {
            if (physicsMarks[i] >= 0 && chemistryMarks[i] >= 0 && mathsMarks[i] >= 0) {
                System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                        (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
            }
        }

        scanner.close();
    }
}
