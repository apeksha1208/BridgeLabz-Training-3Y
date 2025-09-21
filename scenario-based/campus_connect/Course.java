import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private Faculty faculty;
    private List<Student> students;
    
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    
    public Course(String courseId, String courseName, Faculty faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }
    
    public String getCourseId() {
        return courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public Faculty getFaculty() {
        return faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void enrollCourse(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + courseName);
    }
    
    public void dropCourse(Student student) {
        students.remove(student);
        System.out.println("Student " + student.getName() + " dropped from " + courseName);
    }
}
