public class CardioWorkout extends Workout {
    private String cardioType;
    private double intensity;
    
    public CardioWorkout(String workoutType, int duration, String cardioType) {
        super(workoutType, duration);
        this.cardioType = cardioType;
        this.intensity = 1.0;
    }
    
    public CardioWorkout(String workoutType, int duration, String cardioType, double intensity) {
        super(workoutType, duration);
        this.cardioType = cardioType;
        this.intensity = intensity;
    }
    
    public String getCardioType() {
        return cardioType;
    }
    
    public void setCardioType(String cardioType) {
        this.cardioType = cardioType;
    }
    
    public double getIntensity() {
        return intensity;
    }
    
    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }
    
    @Override
    public double calculateCalories() {
        double calories = getDuration() * 8 * intensity;
        setCaloriesBurned(calories);
        return calories;
    }
}
