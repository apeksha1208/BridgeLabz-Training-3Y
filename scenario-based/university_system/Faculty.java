public class Faculty {
    private String facultyId;
    private String name;
    private String department;
    private String email;

    public Faculty(String facultyId, String name, String department, String email) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
