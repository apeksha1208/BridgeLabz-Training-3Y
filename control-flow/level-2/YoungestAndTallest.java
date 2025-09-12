import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = input.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = input.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = input.nextDouble();

        String youngest;
        int minAge = ageAmar;
        youngest = "Amar";
        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        String tallest;
        double maxHeight = heightAmar;
        tallest = "Amar";
        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }

        System.out.println("Youngest: " + youngest + " (" + minAge + ")");
        System.out.println("Tallest: " + tallest + " (" + String.format("%.2f", maxHeight) + " cm)");

        input.close();
    }
}
