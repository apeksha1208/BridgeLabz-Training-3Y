public class BookBasic {
    private String title;
    private String author;
    private double price;

    public BookBasic() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public BookBasic(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "BookBasic{title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}
