public class EWalletApp {
    public static void main(String[] args) {
        User user1 = new User("U001", "John Doe", "john@email.com", "123-456-7890");
        User user2 = new User("U002", "Jane Smith", "jane@email.com", "987-654-3210");
        
        PersonalWallet personalWallet = new PersonalWallet("W001", user1, 500.0, 50.0);
        BusinessWallet businessWallet = new BusinessWallet("W002", user2, 2000.0);
        
        System.out.println("Personal wallet balance: $" + personalWallet.getBalance());
        System.out.println("Business wallet balance: $" + businessWallet.getBalance());
        
        Transaction transaction = new Transaction("T001", user1, user2, 100.0, "Transfer");
        
        boolean transferSuccess = personalWallet.transferTo(user2, 100.0);
        System.out.println("Transfer successful: " + transferSuccess);
        System.out.println("Personal wallet balance after transfer: $" + personalWallet.getBalance());
    }
}
