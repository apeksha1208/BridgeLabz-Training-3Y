public class HomeLoan extends LoanApplication {
    private double propertyValue;
    private double downPayment;
    
    public HomeLoan(String applicationId, int term, double interestRate, Applicant applicant, double propertyValue) {
        super(applicationId, "Home", term, interestRate, applicant);
        this.propertyValue = propertyValue;
        this.downPayment = propertyValue * 0.2;
    }
    
    public HomeLoan(String applicationId, int term, double interestRate, Applicant applicant, double propertyValue, double downPayment) {
        super(applicationId, "Home", term, interestRate, applicant);
        this.propertyValue = propertyValue;
        this.downPayment = downPayment;
    }
    
    public double getPropertyValue() {
        return propertyValue;
    }
    
    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }
    
    public double getDownPayment() {
        return downPayment;
    }
    
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
    
    @Override
    public double calculateEMI() {
        double principal = propertyValue - downPayment;
        double rate = getInterestRate() / 12 / 100;
        int months = getTerm() * 12;
        
        double emi = principal * rate * Math.pow(1 + rate, months) / (Math.pow(1 + rate, months) - 1);
        return emi;
    }
}
