import java.util.ArrayList;

public class Person {
    protected final String NAME;
    protected ArrayList<Book> borrowedBooks;


    public Person(String name) {
        this.NAME = name;
        borrowedBooks = new ArrayList<>();
    }

    public void addBorrowedBooks(Book book) {
        borrowedBooks.add(book);
    }


    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
