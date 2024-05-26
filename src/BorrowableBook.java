import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BorrowableBook extends Book {
    //Attr
    private LocalDate dateOfReturn;
    private boolean available = true;


    //Constr


    public BorrowableBook(String name, int pages, Author author, Genre genre) {
        super(name, pages, author, genre);
    }

    //Meth

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }


    // Takes current date and add 20 days this makes the date of return 20 days from now
    public void setDateOfReturn() {
        dateOfReturn = LocalDate.now().plusDays(20);
        available = false;
    }




    public boolean isAvailable() {
        return available;
    }
}
