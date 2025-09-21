public class Checkout implements ICheckout {
    private Cart cart;
    private double discount;
    
    public Checkout(Cart cart) {
        this.cart = cart;
        this.discount = 0.0;
    }
    
    public Cart getCart() {
        return cart;
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public double generateBill() {
        return cart.getTotalPrice() - discount;
    }
    
    @Override
    public void applyDiscount(double discountAmount) {
        this.discount += discountAmount;
    }
}
