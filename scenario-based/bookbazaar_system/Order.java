import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String customerName;
    private List<Book> books;
    private double totalPrice;
    private String status;
    private int totalQuantity;
    
    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.books = new ArrayList<>();
        this.totalPrice = 0.0;
        this.status = "Pending";
        this.totalQuantity = 0;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getTotalQuantity() {
        return totalQuantity;
    }
    
    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
    
    public void addBook(Book book) {
        books.add(book);
        totalQuantity++;
        calculateTotalPrice();
    }
    
    private void calculateTotalPrice() {
        totalPrice = 0.0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
    }
}
