public class Instructor extends User {
    private String specialization;
    private int yearsOfExperience;
    private int studentsTaught;
    
    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
        this.yearsOfExperience = 0;
        this.studentsTaught = 0;
    }
    
    public Instructor(String name, String email, String userId, String specialization) {
        super(name, email, userId);
        this.specialization = specialization;
        this.yearsOfExperience = 0;
        this.studentsTaught = 0;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public int getStudentsTaught() {
        return studentsTaught;
    }
    
    public void setStudentsTaught(int studentsTaught) {
        this.studentsTaught = studentsTaught;
    }
}
