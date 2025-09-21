public class CurrentAccount extends Account {
    private double overdraftLimit;
    private double transactionFee;
    
    public CurrentAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = 5000.0;
        this.transactionFee = 10.0;
    }
    
    public CurrentAccount(String accountNumber, String accountHolderName, double openingBalance) {
        super(accountNumber, accountHolderName, openingBalance);
        this.overdraftLimit = 5000.0;
        this.transactionFee = 10.0;
    }
    
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    public double getTransactionFee() {
        return transactionFee;
    }
    
    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
    
    @Override
    public double calculateInterest() {
        return getBalance() * 2.0 / 100;
    }
}
