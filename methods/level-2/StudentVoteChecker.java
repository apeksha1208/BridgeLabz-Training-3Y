import java.util.Scanner;

public class StudentVoteChecker {
    
    public boolean canStudentVote(int age) {
        // Validate for negative age
        if (age < 0) {
            return false; // cannot vote
        }
        
        // Check if age is 18 or above
        if (age >= 18) {
            return true; // can vote
        } else {
            return false; // cannot vote
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        
        int[] studentAges = new int[10];
        
        System.out.println("Enter ages for 10 students:");
        
        // Loop through array to take user input for student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        
        System.out.println("\nVoting eligibility results:");
        System.out.println("Student\tAge\tCan Vote");
        System.out.println("-------\t---\t--------");
        
        // Check voting eligibility for each student
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            String status = canVote ? "Yes" : "No";
            System.out.println("Student " + (i + 1) + "\t" + studentAges[i] + "\t" + status);
        }
        
        scanner.close();
    }
}
