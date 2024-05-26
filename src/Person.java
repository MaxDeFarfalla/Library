import java.util.ArrayList;

public class Person {
    protected String name;
    protected ArrayList<Book> borrowedBooks;
    protected ArrayList<Book> cart;

    public Person(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
        cart = new ArrayList<>();
    }
}
