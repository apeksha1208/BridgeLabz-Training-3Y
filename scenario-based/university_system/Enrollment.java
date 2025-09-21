public class Enrollment {
    private String enrollmentId;
    private Student student;
    private Course course;
    private String semester;
    private String grade;

    public Enrollment(String enrollmentId, Student student, Course course, String semester) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.semester = semester;
        this.grade = "";
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
