
public class Book {
    //Attr
    protected String name;
    protected int pages;
    protected Author author;
    protected Genre[] genres;


    //Constr

    public Book(String name, int pages, Author author, Genre[] genres){
        this.name=name;
        this.pages=pages;
        this.author=author;
        this.genres=genres;
        for (Genre genre: genres) {
            genre.addBook(this);
        }

        library.bookHashMap.put(this.name,this);
    }


    //Meth



    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setDateofReturn() {

    }
}
