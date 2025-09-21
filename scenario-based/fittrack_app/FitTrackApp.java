public class FitTrackApp {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("John Doe", 25, 75.0, "Weight Loss", "U001");
        
        CardioWorkout running = new CardioWorkout("Running", 30, "Outdoor Running", 1.2);
        StrengthWorkout weightlifting = new StrengthWorkout("Weightlifting", 45, 3, 12, 80.0);
        
        running.calculateCalories();
        weightlifting.calculateCalories();
        
        double dailyTarget = user.calculateDailyTarget();
        double totalCaloriesBurned = running.getCaloriesBurned() + weightlifting.getCaloriesBurned();
        double progress = dailyTarget - totalCaloriesBurned;
        
        System.out.println("User: " + user.getName() + ", Goal: " + user.getGoal());
        System.out.println("Daily target: " + dailyTarget + " calories");
        System.out.println("Running calories burned: " + running.getCaloriesBurned());
        System.out.println("Weightlifting calories burned: " + weightlifting.getCaloriesBurned());
        System.out.println("Total calories burned: " + totalCaloriesBurned);
        System.out.println("Progress: " + progress + " calories remaining");
    }
}
