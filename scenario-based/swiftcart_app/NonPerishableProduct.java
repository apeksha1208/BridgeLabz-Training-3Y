public class NonPerishableProduct extends Product {
    private String shelfLife;
    private boolean isOrganic;
    
    public NonPerishableProduct(String name, double price, String category, String shelfLife) {
        super(name, price, category);
        this.shelfLife = shelfLife;
        this.isOrganic = false;
    }
    
    public NonPerishableProduct(String name, double price, String category, int stock, String shelfLife, boolean isOrganic) {
        super(name, price, category, stock);
        this.shelfLife = shelfLife;
        this.isOrganic = isOrganic;
    }
    
    public String getShelfLife() {
        return shelfLife;
    }
    
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }
    
    public boolean isOrganic() {
        return isOrganic;
    }
    
    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }
}
