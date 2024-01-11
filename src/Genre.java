import java.util.ArrayList;

public class Genre {
    protected String name;
    protected ArrayList books;

    public Genre(){}

    public Genre(String name, ArrayList books){
        this.name = name;
        this.books = books;
    }
}
