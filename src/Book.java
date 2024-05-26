import java.util.UUID;

public class Book {
    //Inte abstarct då det gör att book kan användas i sök prosessen i library

    //Attr
    protected String name;
    protected int pages;
    protected Author author;
    protected Genre genre;
    protected UUID BOOKID;


    //Constr

    public Book(String name, int pages, Author author, Genre genres) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.genre = genres;


    }


    //Meth


    //Getters and setters
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
