public class AutoLoan extends LoanApplication {
    private String vehicleType;
    private double vehicleValue;
    
    public AutoLoan(String applicationId, int term, double interestRate, Applicant applicant, String vehicleType, double vehicleValue) {
        super(applicationId, "Auto", term, interestRate, applicant);
        this.vehicleType = vehicleType;
        this.vehicleValue = vehicleValue;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public double getVehicleValue() {
        return vehicleValue;
    }
    
    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }
    
    @Override
    public double calculateEMI() {
        double principal = getApplicant().getLoanAmount();
        double rate = getInterestRate() / 12 / 100;
        int months = getTerm() * 12;
        
        double emi = principal * rate * Math.pow(1 + rate, months) / (Math.pow(1 + rate, months) - 1);
        return emi;
    }
}
