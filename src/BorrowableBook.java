import java.time.LocalDate;
import java.util.Scanner;

public class BorrowableBook extends Book {
    //Attr
    private LocalDate dateOfReturn;

    //Constr

    public BorrowableBook() {
    }

    //Meth

    //Checks if book is borrowable and sets returnDate if borrowed
    private void borrowBook() {
        Scanner bookScanner = new Scanner(System.in);
        boolean borrowable = false;
        String answer;

        generateData();


        if (dateOfReturn == null) {
            borrowable = true;

        }

        if (borrowable == true) {
            System.out.println("Wish to borrow? " + name + " of " + author.getName());
            answer = bookScanner.nextLine().toLowerCase();
            if (answer == "y" || answer == "yes") {
                dateOfReturn = LocalDate.now().plusDays(20);

                System.out.println("Hope you enjoy - Book is to be returned within " + dateOfReturn);
            } else {
                System.out.println("Have a good day");
            }

        } else {
            System.out.println("Not available - Have a good day");
        }

    }

    private void generateData() {
        this.name = "test";
        this.author = new Author();
        this.pages = 1;
    }

    public void borrow() {
        borrowBook();
    }
}
