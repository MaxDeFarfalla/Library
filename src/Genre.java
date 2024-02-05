import java.util.ArrayList;

public class Genre {
    protected String name;
    protected ArrayList books;

    public Genre(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public Genre(String name, ArrayList books){
        this.name = name;
        this.books = books;
    }

    //Meth


    public ArrayList getBooks() {
        return books;
    }

   public void addBook(Book book){
        books.add(book);
   }

}
