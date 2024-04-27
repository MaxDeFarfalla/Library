
public class Book {
    //Attr
    protected String name;
    protected int pages;
    protected Author author;
    protected Genre[] genres;
    protected Boolean borrowable;

    //Constr

    public Book(String name, int pages, Author author, Genre[] genres){
        this.name=name;
        this.pages=pages;
        this.author=author;
        this.genres=genres;
        for (Genre genre: genres) {
            genre.addBook(this);
        }

        Library.bookHashMap.put(this.name,this);
    }


    //Meth


    public void setBorrowable(Boolean borrowable, Class<Book> BorrowableBook) {
        if (Book.class== BorrowableBook)
        this.borrowable = borrowable;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setDateofReturn() {

    }
}
