public class BusinessWallet extends Wallet {
    private double monthlyLimit;
    private String businessType;
    
    public BusinessWallet(String walletId, User owner) {
        super(walletId, owner);
        this.monthlyLimit = 10000.0;
        setWalletType("Business");
    }
    
    public BusinessWallet(String walletId, User owner, double initialBalance) {
        super(walletId, owner, initialBalance);
        this.monthlyLimit = 10000.0;
        setWalletType("Business");
    }
    
    public double getMonthlyLimit() {
        return monthlyLimit;
    }
    
    public void setMonthlyLimit(double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }
    
    public String getBusinessType() {
        return businessType;
    }
    
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    
    public boolean transferTo(User receiver, double amount) {
        if (amount <= monthlyLimit && deductMoney(amount)) {
            return true;
        }
        return false;
    }
}
