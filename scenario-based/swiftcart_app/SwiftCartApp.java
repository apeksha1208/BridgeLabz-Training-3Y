public class SwiftCartApp {
    public static void main(String[] args) {
        PerishableProduct milk = new PerishableProduct("Fresh Milk", 3.50, "Dairy", 10, "2024-01-20", true);
        NonPerishableProduct rice = new NonPerishableProduct("Basmati Rice", 8.99, "Grains", 50, "2 years", false);
        
        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);
        
        Checkout checkout = new Checkout(cart);
        checkout.applyDiscount(2.0);
        
        System.out.println("Total items in cart: " + cart.getTotalItems());
        System.out.println("Total price: $" + cart.getTotalPrice());
        System.out.println("Final bill after discount: $" + checkout.generateBill());
        
        System.out.println("Milk price * 2: $" + (milk.getPrice() * 2));
        System.out.println("Rice stock: " + rice.getStock());
    }
}
