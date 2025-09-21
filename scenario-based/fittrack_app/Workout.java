public abstract class Workout {
    private String workoutType;
    private int duration;
    private double caloriesBurned;
    private String date;
    
    public Workout(String workoutType, int duration) {
        this.workoutType = workoutType;
        this.duration = duration;
        this.caloriesBurned = 0.0;
        this.date = java.time.LocalDate.now().toString();
    }
    
    public String getWorkoutType() {
        return workoutType;
    }
    
    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public double getCaloriesBurned() {
        return caloriesBurned;
    }
    
    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public abstract double calculateCalories();
}
