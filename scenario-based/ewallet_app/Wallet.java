public abstract class Wallet {
    private String walletId;
    private User owner;
    private double balance;
    private String walletType;

    public Wallet(String walletId, User owner) {
        this.walletId = walletId;
        this.owner = owner;
        this.balance = 0.0;
    }

    public Wallet(String walletId, User owner, double initialBalance) {
        this.walletId = walletId;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getWalletType() {
        return walletType;
    }

    protected void setWalletType(String walletType) {
        this.walletType = walletType;
    }

    public void addMoney(double amount) {
        this.balance += amount;
    }

    public boolean deductMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
