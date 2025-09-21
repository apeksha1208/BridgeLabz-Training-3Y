public class OutPatient extends Patient {
    private String appointmentDate;
    private String department;

    public OutPatient(String name, int age, String patientId) {
        super(name, age, patientId);
    }

    public OutPatient(String name, int age, String patientId, String appointmentDate, String department) {
        super(name, age, patientId);
        this.appointmentDate = appointmentDate;
        this.department = department;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient: " + getSummary() + ", Date: " + appointmentDate + ", Dept: " + department);
    }
}
