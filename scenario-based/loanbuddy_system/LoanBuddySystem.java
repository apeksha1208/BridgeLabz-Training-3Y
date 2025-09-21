public class LoanBuddySystem {
    public static void main(String[] args) {
        Applicant applicant1 = new Applicant("John Doe", 720, 80000, 50000, "Salaried");
        Applicant applicant2 = new Applicant("Jane Smith", 680, 120000, 300000, "Self-Employed");
        
        PersonalLoan personalLoan = new PersonalLoan("PL001", 3, 12.5, applicant1, 1000.0);
        HomeLoan homeLoan = new HomeLoan("HL001", 20, 8.5, applicant2, 500000, 100000);
        
        LoanApprovalEngine personalEngine = new LoanApprovalEngine(personalLoan);
        LoanApprovalEngine homeEngine = new LoanApprovalEngine(homeLoan);
        
        boolean personalApproved = personalEngine.approveLoan();
        boolean homeApproved = homeEngine.approveLoan();
        
        System.out.println("Personal loan approved: " + personalApproved);
        System.out.println("Personal loan EMI: $" + personalEngine.calculateEMI());
        
        System.out.println("Home loan approved: " + homeApproved);
        System.out.println("Home loan EMI: $" + homeEngine.calculateEMI());
        
        double principal = 50000;
        double rate = 12.5 / 12 / 100;
        int months = 36;
        double emi = principal * rate * Math.pow(1 + rate, months) / (Math.pow(1 + rate, months) - 1);
        System.out.println("Manual EMI calculation: $" + emi);
    }
}
