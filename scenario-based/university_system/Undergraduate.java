public class Undergraduate extends Student {
    private String major;
    private int creditsCompleted;

    public Undergraduate(String studentId, String name, String email) {
        super(studentId, name, email);
        this.creditsCompleted = 0;
    }

    public Undergraduate(String studentId, String name, String email, String major) {
        super(studentId, name, email);
        this.major = major;
        this.creditsCompleted = 0;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(int creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }
}
