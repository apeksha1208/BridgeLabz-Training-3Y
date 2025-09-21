public class LoanApprovalEngine implements IApprovable {
    private LoanApplication loanApplication;
    
    public LoanApprovalEngine(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
    
    public LoanApplication getLoanApplication() {
        return loanApplication;
    }
    
    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
    
    @Override
    public boolean approveLoan() {
        Applicant applicant = loanApplication.getApplicant();
        
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= loanApplication.getApplicant().getLoanAmount() * 0.3) {
            loanApplication.setStatus("Approved");
            return true;
        } else {
            loanApplication.setStatus("Rejected");
            return false;
        }
    }
    
    @Override
    public double calculateEMI() {
        return loanApplication.calculateEMI();
    }
}
