public class HospitalSystem {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", "Cardiology", "DOC123", 10);
        doctor.displayInfo();

        InPatient inPatient = new InPatient("John Doe", 45, "P001");
        inPatient.setRoomNumber("101");
        inPatient.setDaysStayed(3);
        inPatient.displayInfo();

        OutPatient outPatient = new OutPatient("Jane Smith", 30, "P002", "2024-01-15", "General");
        outPatient.displayInfo();

        Bill bill1 = new Bill("B001", 1000.0, 50.0, 100.0, inPatient, doctor);
        System.out.println("Bill Total: $" + bill1.calculatePayment());

        Bill bill2 = new Bill("B002", 500.0, outPatient, doctor);
        bill2.setDiscount(25.0);
        bill2.setTax(50.0);
        System.out.println("Bill Total: $" + bill2.calculatePayment());
    }
}
