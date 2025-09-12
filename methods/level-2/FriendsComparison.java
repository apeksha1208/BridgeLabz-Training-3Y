import java.util.Scanner;

public class FriendsComparison {
    
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }
    
    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter age and height for 3 friends:");
        
        // Take user input for age and height for the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height (in cm) for " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }
        
        // Find youngest and tallest
        int youngestAge = findYoungest(ages);
        double tallestHeight = findTallest(heights);
        
        System.out.println("\nResults:");
        System.out.println("Youngest age among friends: " + youngestAge + " years");
        System.out.println("Tallest height among friends: " + tallestHeight + " cm");
        
        // Display which friends are youngest and tallest
        System.out.println("\nYoungest friends:");
        for (int i = 0; i < 3; i++) {
            if (ages[i] == youngestAge) {
                System.out.println("- " + friends[i] + " (age: " + ages[i] + ")");
            }
        }
        
        System.out.println("Tallest friends:");
        for (int i = 0; i < 3; i++) {
            if (heights[i] == tallestHeight) {
                System.out.println("- " + friends[i] + " (height: " + heights[i] + " cm)");
            }
        }
        
        scanner.close();
    }
}
