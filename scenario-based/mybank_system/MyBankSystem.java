public class MyBankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", "John Doe", 5000.0);
        CurrentAccount current = new CurrentAccount("CA001", "Jane Smith", 2000.0);
        
        BankingTransaction savingsTransaction = new BankingTransaction(savings);
        BankingTransaction currentTransaction = new BankingTransaction(current);
        
        savingsTransaction.deposit(1000.0);
        savingsTransaction.withdraw(500.0);
        System.out.println("Savings interest: $" + savings.calculateInterest());
        
        currentTransaction.deposit(2000.0);
        currentTransaction.withdraw(1500.0);
        System.out.println("Current account interest: $" + current.calculateInterest());
        
        System.out.println("Savings balance: $" + savingsTransaction.checkBalance());
        System.out.println("Current balance: $" + currentTransaction.checkBalance());
    }
}
