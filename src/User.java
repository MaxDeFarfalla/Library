public class User extends Person {

    public User (String name) {
        super(name);
    }

    public void addBorrowedBooks(Book book) {
        borrowedBooks.add(book);
    }


}
