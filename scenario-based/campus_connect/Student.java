import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String major;
    private int year;
    private List<String> grades;
    private double gpa;
    
    public Student(String name, String email, String id) {
        super(name, email, id);
        this.grades = new ArrayList<>();
        this.gpa = 0.0;
    }
    
    public Student(String name, String email, String id, String major, int year) {
        super(name, email, id);
        this.major = major;
        this.year = year;
        this.grades = new ArrayList<>();
        this.gpa = 0.0;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public List<String> getGrades() {
        return grades;
    }
    
    public void setGrades(List<String> grades) {
        this.grades = grades;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void addGrade(String grade) {
        grades.add(grade);
        calculateGPA();
    }
    
    private void calculateGPA() {
        double totalPoints = 0;
        for (String grade : grades) {
            switch (grade) {
                case "A": totalPoints += 4.0; break;
                case "B": totalPoints += 3.0; break;
                case "C": totalPoints += 2.0; break;
                case "D": totalPoints += 1.0; break;
                default: totalPoints += 0.0; break;
            }
        }
        this.gpa = grades.isEmpty() ? 0.0 : totalPoints / grades.size();
    }
    
    @Override
    public void printDetails() {
        System.out.println("Student: " + getName() + ", ID: " + getId() + ", Major: " + major + ", GPA: " + gpa);
    }
}
