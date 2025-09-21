public class PerishableProduct extends Product {
    private String expiryDate;
    private boolean requiresRefrigeration;
    
    public PerishableProduct(String name, double price, String category, String expiryDate) {
        super(name, price, category);
        this.expiryDate = expiryDate;
        this.requiresRefrigeration = false;
    }
    
    public PerishableProduct(String name, double price, String category, int stock, String expiryDate, boolean requiresRefrigeration) {
        super(name, price, category, stock);
        this.expiryDate = expiryDate;
        this.requiresRefrigeration = requiresRefrigeration;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }
    
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public boolean isRequiresRefrigeration() {
        return requiresRefrigeration;
    }
    
    public void setRequiresRefrigeration(boolean requiresRefrigeration) {
        this.requiresRefrigeration = requiresRefrigeration;
    }
}
