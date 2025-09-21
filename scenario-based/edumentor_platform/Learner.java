public class Learner extends User {
    private String learningPath;
    private int coursesCompleted;
    private double progressPercentage;
    
    public Learner(String name, String email, String userId) {
        super(name, email, userId);
        this.coursesCompleted = 0;
        this.progressPercentage = 0.0;
    }
    
    public Learner(String name, String email, String userId, String learningPath) {
        super(name, email, userId);
        this.learningPath = learningPath;
        this.coursesCompleted = 0;
        this.progressPercentage = 0.0;
    }
    
    public String getLearningPath() {
        return learningPath;
    }
    
    public void setLearningPath(String learningPath) {
        this.learningPath = learningPath;
    }
    
    public int getCoursesCompleted() {
        return coursesCompleted;
    }
    
    public void setCoursesCompleted(int coursesCompleted) {
        this.coursesCompleted = coursesCompleted;
    }
    
    public double getProgressPercentage() {
        return progressPercentage;
    }
    
    public void setProgressPercentage(double progressPercentage) {
        this.progressPercentage = progressPercentage;
    }
}
