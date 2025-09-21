public class PersonalWallet extends Wallet {
    private double dailyLimit;

    public PersonalWallet(String walletId, User owner) {
        super(walletId, owner);
        this.dailyLimit = 1000.0;
        setWalletType("Personal");
    }

    public PersonalWallet(String walletId, User owner, double initialBalance) {
        super(walletId, owner, initialBalance);
        this.dailyLimit = 1000.0;
        setWalletType("Personal");
    }

    public PersonalWallet(String walletId, User owner, double initialBalance, double referralBonus) {
        super(walletId, owner, initialBalance + referralBonus);
        this.dailyLimit = 1000.0;
        setWalletType("Personal");
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public boolean transferTo(User receiver, double amount) {
        if (amount <= dailyLimit && deductMoney(amount)) {
            return true;
        }
        return false;
    }
}
