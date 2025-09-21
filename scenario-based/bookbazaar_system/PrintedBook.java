public class PrintedBook extends Book {
    private String binding;
    private int pages;
    
    public PrintedBook(String title, String author, double price, String isbn, String binding) {
        super(title, author, price, isbn);
        this.binding = binding;
        this.pages = 0;
    }
    
    public PrintedBook(String title, String author, double price, int stock, String isbn, String binding, int pages) {
        super(title, author, price, stock, isbn);
        this.binding = binding;
        this.pages = pages;
    }
    
    public String getBinding() {
        return binding;
    }
    
    public void setBinding(String binding) {
        this.binding = binding;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    @Override
    public double applyDiscount() {
        return getPrice() * 0.9;
    }
}
