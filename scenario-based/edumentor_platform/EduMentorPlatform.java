public class EduMentorPlatform {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Dr. Johnson", "johnson@edumentor.com", "I001", "Java Programming");
        Learner learner = new Learner("Alice Smith", "alice@student.com", "L001", "Software Development");
        
        Course javaCourse = new Course("C001", "Java Fundamentals", instructor, "6 months");
        Course shortCourse = new Course("C002", "Quick Python Basics", instructor, "2 weeks short");
        
        Quiz quiz = new Quiz("Q001", "Java Basics Quiz", new String[]{"What is Java?", "What is OOP?"}, 
                           new String[]{"Programming Language", "Object Oriented Programming"}, "Easy");
        quiz.setScore(2);
        
        System.out.println("Quiz percentage: " + quiz.calculatePercentage() + "%");
        System.out.println("Short course certificate: " + shortCourse.generateCertificate());
        System.out.println("Full course certificate: " + javaCourse.generateCertificate());
        
        learner.setCoursesCompleted(5);
        learner.setProgressPercentage(75.0);
        
        System.out.println("Learner: " + learner.getName() + ", Progress: " + learner.getProgressPercentage() + "%");
        System.out.println("Instructor: " + instructor.getName() + ", Specialization: " + instructor.getSpecialization());
    }
}
