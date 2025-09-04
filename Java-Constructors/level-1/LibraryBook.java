public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook() {
        this("Unknown Title", "Unknown Author", 0.0, true);
    }

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return available;
    }

    public String toString() {
        return "LibraryBook{title='" + title + "', author='" + author + "', price=" + price + ", available=" + available
                + "}";
    }
}
