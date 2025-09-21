public class PersonalLoan extends LoanApplication {
    private double processingFee;
    
    public PersonalLoan(String applicationId, int term, double interestRate, Applicant applicant) {
        super(applicationId, "Personal", term, interestRate, applicant);
        this.processingFee = 500.0;
    }
    
    public PersonalLoan(String applicationId, int term, double interestRate, Applicant applicant, double processingFee) {
        super(applicationId, "Personal", term, interestRate, applicant);
        this.processingFee = processingFee;
    }
    
    public double getProcessingFee() {
        return processingFee;
    }
    
    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }
    
    @Override
    public double calculateEMI() {
        double principal = getApplicant().getLoanAmount();
        double rate = getInterestRate() / 12 / 100;
        int months = getTerm() * 12;
        
        double emi = principal * rate * Math.pow(1 + rate, months) / (Math.pow(1 + rate, months) - 1);
        return emi + processingFee / months;
    }
}
