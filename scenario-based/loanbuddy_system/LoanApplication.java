public abstract class LoanApplication {
    private String applicationId;
    private String loanType;
    private int term;
    private double interestRate;
    private String status;
    private Applicant applicant;
    
    public LoanApplication(String applicationId, String loanType, int term, double interestRate, Applicant applicant) {
        this.applicationId = applicationId;
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
        this.status = "Pending";
    }
    
    public String getApplicationId() {
        return applicationId;
    }
    
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    
    public String getLoanType() {
        return loanType;
    }
    
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    
    public int getTerm() {
        return term;
    }
    
    public void setTerm(int term) {
        this.term = term;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Applicant getApplicant() {
        return applicant;
    }
    
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
    
    public abstract double calculateEMI();
}
