import java.util.ArrayList;

public class Genre {
    protected String name;
    protected ArrayList books;

    //Costr that takes input for name of genre and creates an ArrayList of books

    public Genre(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }



    //Meth

 // Returns the arrayList containing all books
    public ArrayList getBooks() {
        return books;
    }

   public void addBook(Book book){
        books.add(book);
   }

}
