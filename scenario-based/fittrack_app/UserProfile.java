public class UserProfile {
    private String name;
    private int age;
    private double weight;
    private String goal;
    private String userId;
    
    public UserProfile(String name, int age, String userId) {
        this.name = name;
        this.age = age;
        this.userId = userId;
        this.weight = 70.0;
        this.goal = "General Fitness";
    }
    
    public UserProfile(String name, int age, double weight, String goal, String userId) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getGoal() {
        return goal;
    }
    
    public void setGoal(String goal) {
        this.goal = goal;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public double calculateDailyTarget() {
        return weight * 30;
    }
}
