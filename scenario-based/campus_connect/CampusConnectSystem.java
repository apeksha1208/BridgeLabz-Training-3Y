public class CampusConnectSystem {
    public static void main(String[] args) {
        Faculty professor = new Faculty("Dr. Smith", "smith@university.edu", "F001", "Computer Science", "Professor", 15);
        Student student1 = new Student("Alice Johnson", "alice@student.edu", "S001", "Computer Science", 3);
        Student student2 = new Student("Bob Wilson", "bob@student.edu", "S002", "Mathematics", 2);
        
        Course javaCourse = new Course("CS101", "Java Programming", professor);
        
        javaCourse.enrollCourse(student1);
        javaCourse.enrollCourse(student2);
        
        student1.addGrade("A");
        student1.addGrade("B");
        student1.addGrade("A");
        
        student2.addGrade("B");
        student2.addGrade("C");
        
        professor.printDetails();
        student1.printDetails();
        student2.printDetails();
        
        System.out.println("Course: " + javaCourse.getCourseName() + " taught by " + javaCourse.getFaculty().getName());
    }
}
