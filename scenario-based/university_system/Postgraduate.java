public class Postgraduate extends Student {
    private String researchTopic;
    private String supervisor;

    public Postgraduate(String studentId, String name, String email) {
        super(studentId, name, email);
    }

    public Postgraduate(String studentId, String name, String email, String researchTopic, String supervisor) {
        super(studentId, name, email);
        this.researchTopic = researchTopic;
        this.supervisor = supervisor;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
