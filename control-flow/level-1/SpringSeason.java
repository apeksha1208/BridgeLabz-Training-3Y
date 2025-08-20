public class SpringSeason {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;
        // Spring from March 20 (3/20) to June 20 (6/20)
        if (month == 3) {
            isSpring = day >= 20 && day <= 31;
        } else if (month == 4) {
            isSpring = day >= 1 && day <= 30;
        } else if (month == 5) {
            isSpring = day >= 1 && day <= 31;
        } else if (month == 6) {
            isSpring = day >= 1 && day <= 20;
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}


