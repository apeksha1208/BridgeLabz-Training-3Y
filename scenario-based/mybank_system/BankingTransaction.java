public class BankingTransaction implements ITransaction {
    private Account account;
    
    public BankingTransaction(Account account) {
        this.account = account;
    }
    
    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    
    @Override
    public void deposit(double amount) {
        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
        System.out.println("Deposited: $" + amount + ". New balance: $" + newBalance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            System.out.println("Withdrawn: $" + amount + ". New balance: $" + newBalance);
        } else {
            System.out.println("Insufficient balance. Cannot withdraw $" + amount);
        }
    }
    
    @Override
    public double checkBalance() {
        return account.getBalance();
    }
}
