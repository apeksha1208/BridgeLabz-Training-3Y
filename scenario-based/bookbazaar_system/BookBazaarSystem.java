public class BookBazaarSystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Programming", "John Author", 29.99, "978-123456789", "PDF", 15.5);
        PrintedBook printedBook = new PrintedBook("Python Basics", "Jane Writer", 39.99, "978-987654321", "Hardcover", 350);
        
        Order order = new Order("ORD001", "Alice Customer");
        order.addBook(ebook);
        order.addBook(printedBook);
        
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Total quantity: " + order.getTotalQuantity());
        System.out.println("Total price: $" + order.getTotalPrice());
        
        System.out.println("EBook discounted price: $" + ebook.applyDiscount());
        System.out.println("Printed book discounted price: $" + printedBook.applyDiscount());
        
        double totalWithDiscount = ebook.applyDiscount() + printedBook.applyDiscount();
        System.out.println("Total with discounts: $" + totalWithDiscount);
        
        System.out.println("Price calculation: " + ebook.getPrice() + " * 2 = $" + (ebook.getPrice() * 2));
        System.out.println("Stock check: EBook stock = " + ebook.getStock());
    }
}
