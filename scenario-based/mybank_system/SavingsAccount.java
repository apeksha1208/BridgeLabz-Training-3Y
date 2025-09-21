public class SavingsAccount extends Account {
    private double interestRate;
    private double minimumBalance;
    
    public SavingsAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.interestRate = 4.5;
        this.minimumBalance = 1000.0;
    }
    
    public SavingsAccount(String accountNumber, String accountHolderName, double openingBalance) {
        super(accountNumber, accountHolderName, openingBalance);
        this.interestRate = 4.5;
        this.minimumBalance = 1000.0;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public double getMinimumBalance() {
        return minimumBalance;
    }
    
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
