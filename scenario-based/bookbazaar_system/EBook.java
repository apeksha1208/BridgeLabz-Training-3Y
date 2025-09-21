public class EBook extends Book {
    private String format;
    private double fileSize;
    
    public EBook(String title, String author, double price, String isbn, String format) {
        super(title, author, price, isbn);
        this.format = format;
        this.fileSize = 0.0;
    }
    
    public EBook(String title, String author, double price, int stock, String isbn, String format, double fileSize) {
        super(title, author, price, stock, isbn);
        this.format = format;
        this.fileSize = fileSize;
    }
    
    public String getFormat() {
        return format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
    
    public double getFileSize() {
        return fileSize;
    }
    
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    
    @Override
    public double applyDiscount() {
        return getPrice() * 0.8;
    }
}
