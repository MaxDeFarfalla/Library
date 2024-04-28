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


    //Checks if book is borrowable and sets returnDate if borrowed
    private void borrowBook() {
        Scanner bookScanner = new Scanner(System.in);
        String answer;
        generateData();


        if (available) {

            System.out.println("Wish to borrow? " + name + " of " + author.getName());
            answer = bookScanner.nextLine().toLowerCase();

            if (answer.equals("y") || answer.equals("yes")) {
                dateOfReturn = LocalDate.now().plusDays(20);
                available = false;

                System.out.println("Hope you enjoy - Book is to be returned at latest " + dateOfReturn);
            } else {
                System.out.println("Have a good day");
            }

        } else {
            System.out.println("Not available - Have a good day");
        }

    }
        // Takes current date and add 20 days this makes the date of return 20 days from now

    public void setDateOfReturn(){
        dateOfReturn = LocalDate.now().plusDays(20);
        available = false;
    }


    private void generateData() {
        this.name = "test";
        this.author = new Author("Tester");
        this.pages = 1;
    }


    public boolean isAvailable() {
        return available;
    }
}
