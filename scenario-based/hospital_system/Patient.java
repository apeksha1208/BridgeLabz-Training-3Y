public abstract class Patient {
    private String name;
    private int age;
    private String medicalHistory;
    private String patientId;

    public Patient(String name, int age, String patientId) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
        this.medicalHistory = "";
    }

    public Patient(String name, int age, String patientId, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient: " + name + ", Age: " + age + ", ID: " + patientId;
    }

    public abstract void displayInfo();
}
