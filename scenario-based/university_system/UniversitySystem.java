public class UniversitySystem {
    public static void main(String[] args) {
        Faculty professor = new Faculty("F001", "Dr. Johnson", "Computer Science", "johnson@university.edu");

        Course javaCourse = new Course("CS101", "Java Programming", 3, professor);

        Undergraduate undergrad = new Undergraduate("S001", "Alice Smith", "alice@student.edu", "Computer Science");
        Postgraduate grad = new Postgraduate("S002", "Bob Wilson", "bob@student.edu", "Machine Learning",
                "Dr. Johnson");

        javaCourse.enrollStudent(undergrad);
        javaCourse.enrollStudent(grad);

        Enrollment enrollment1 = new Enrollment("E001", undergrad, javaCourse, "Fall 2024");
        Enrollment enrollment2 = new Enrollment("E002", grad, javaCourse, "Fall 2024");

        enrollment1.setGrade("A");
        enrollment2.setGrade("A+");

        undergrad.calculateGpa(12.0, 4);
        grad.calculateGpa(15.0, 4);

        System.out.println("Undergraduate GPA: " + undergrad.getGpa());
        System.out.println("Postgraduate GPA: " + grad.getGpa());
    }
}
