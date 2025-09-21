


public class Bill implements Payable {
    private String billId;
    private double baseAmount;
    private double discount;
    private double tax;
    private Patient patient;
    private Doctor doctor;

    public Bill(String billId, double baseAmount, Patient patient, Doctor doctor) {
        this.billId = billId;
        this.baseAmount = baseAmount;
        this.patient = patient;
        this.doctor = doctor;
        this.discount = 0;
        this.tax = 0;
    }

    public Bill(String billId, double baseAmount, double discount, double tax, Patient patient, Doctor doctor) {
        this.billId = billId;
        this.baseAmount = baseAmount;
        this.discount = discount;
        this.tax = tax;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public double calculatePayment() {
        double total = baseAmount - discount + tax;
        return total;
    }
}
