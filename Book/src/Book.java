import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book(String name,Author[] authors, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }
    public Book(String name,Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(){}

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorsName() {
        String authorsName = "";
        for (int i = 0; i < authors.length; i++) {
            authorsName += authors[i].getName() + ", ";
        }
        return authorsName.substring(0, authorsName.length() - 2);
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=[" + getAuthorsName() +
                "], price=" + price +
                ", qty=" + qty +
                '}';
    }
}
