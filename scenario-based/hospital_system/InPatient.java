public class InPatient extends Patient {
    private String roomNumber;
    private int daysStayed;

    public InPatient(String name, int age, String patientId) {
        super(name, age, patientId);
    }

    public InPatient(String name, int age, String patientId, String roomNumber) {
        super(name, age, patientId);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDaysStayed() {
        return daysStayed;
    }

    public void setDaysStayed(int daysStayed) {
        this.daysStayed = daysStayed;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient: " + getSummary() + ", Room: " + roomNumber + ", Days: " + daysStayed);
    }
}
