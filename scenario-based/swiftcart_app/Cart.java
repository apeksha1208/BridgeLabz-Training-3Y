import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private double totalPrice;
    private int totalItems;
    
    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
        this.totalItems = 0;
    }
    
    public Cart(List<Product> preSelectedItems) {
        this.products = new ArrayList<>(preSelectedItems);
        this.totalItems = preSelectedItems.size();
        calculateTotalPrice();
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
        this.totalItems = products.size();
        calculateTotalPrice();
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public int getTotalItems() {
        return totalItems;
    }
    
    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }
    
    public void addProduct(Product product) {
        products.add(product);
        totalItems++;
        calculateTotalPrice();
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
        totalItems--;
        calculateTotalPrice();
    }
    
    private void calculateTotalPrice() {
        totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }
}
