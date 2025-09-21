public class Faculty extends Person {
    private String department;
    private String designation;
    private int experience;
    
    public Faculty(String name, String email, String id) {
        super(name, email, id);
        this.experience = 0;
    }
    
    public Faculty(String name, String email, String id, String department, String designation) {
        super(name, email, id);
        this.department = department;
        this.designation = designation;
        this.experience = 0;
    }
    
    public Faculty(String name, String email, String id, String department, String designation, int experience) {
        super(name, email, id);
        this.department = department;
        this.designation = designation;
        this.experience = experience;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public int getExperience() {
        return experience;
    }
    
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    @Override
    public void printDetails() {
        System.out.println("Faculty: " + getName() + ", ID: " + getId() + ", Department: " + department + ", Experience: " + experience + " years");
    }
}
