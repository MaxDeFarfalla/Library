
public class Book {
    //Attr
    protected String name;
    protected int pages;
    protected Author author;
    protected Genre genre;


    //Constr

    public Book(String name, int pages, Author author, Genre genres){
        this.name=name;
        this.pages=pages;
        this.author=author;
        this.genre=genres;



    }


    //Meth



    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }


}
