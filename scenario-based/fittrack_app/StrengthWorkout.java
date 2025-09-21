public class StrengthWorkout extends Workout {
    private int sets;
    private int reps;
    private double weightLifted;
    
    public StrengthWorkout(String workoutType, int duration, int sets, int reps) {
        super(workoutType, duration);
        this.sets = sets;
        this.reps = reps;
        this.weightLifted = 0.0;
    }
    
    public StrengthWorkout(String workoutType, int duration, int sets, int reps, double weightLifted) {
        super(workoutType, duration);
        this.sets = sets;
        this.reps = reps;
        this.weightLifted = weightLifted;
    }
    
    public int getSets() {
        return sets;
    }
    
    public void setSets(int sets) {
        this.sets = sets;
    }
    
    public int getReps() {
        return reps;
    }
    
    public void setReps(int reps) {
        this.reps = reps;
    }
    
    public double getWeightLifted() {
        return weightLifted;
    }
    
    public void setWeightLifted(double weightLifted) {
        this.weightLifted = weightLifted;
    }
    
    @Override
    public double calculateCalories() {
        double calories = (sets * reps * weightLifted * 0.5) + (getDuration() * 5);
        setCaloriesBurned(calories);
        return calories;
    }
}
