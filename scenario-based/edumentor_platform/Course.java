public class Course implements ICertifiable {
    private String courseId;
    private String courseName;
    private Instructor instructor;
    private String duration;
    private boolean isCompleted;
    
    public Course(String courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.isCompleted = false;
    }
    
    public Course(String courseId, String courseName, Instructor instructor, String duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
        this.isCompleted = false;
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
    
    public Instructor getInstructor() {
        return instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public boolean isCompleted() {
        return isCompleted;
    }
    
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    
    @Override
    public String generateCertificate() {
        if (duration.contains("short")) {
            return "Short Course Certificate for " + courseName;
        } else {
            return "Full Course Certificate for " + courseName;
        }
    }
}
