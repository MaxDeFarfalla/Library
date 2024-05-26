import java.util.ArrayList;

public class Person {
    protected final String NAME;
    protected ArrayList<Book> borrowedBooks;
    protected ArrayList<Book> cart;

    public Person(String name) {
        this.NAME = name;
        borrowedBooks = new ArrayList<>();
        cart = new ArrayList<>();
    }
}
