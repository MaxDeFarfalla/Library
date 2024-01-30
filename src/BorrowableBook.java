import java.time.LocalDate;
import java.util.Date;
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
        String answer;
        generateData();


        if (dateOfReturn == null) {

            System.out.println("Wish to borrow? " + name + " of " + author.getName());
            answer = bookScanner.nextLine().toLowerCase();

            if (answer.equals("y") || answer.equals("yes")) {
                dateOfReturn = LocalDate.now().plusDays(20);

                System.out.println("Hope you enjoy - Book is to be returned at latest " + dateOfReturn);
            } else {
                System.out.println("Have a good day");
            }

        } else {
            System.out.println("Not available - Have a good day");
        }

    }

    private void bookReturn(){
        System.out.println("Wish to return "+ name +"?");
        Scanner bookScanner = new Scanner(System.in);
        String answer = bookScanner.nextLine().toLowerCase();

        if (answer.equals("y") || (answer.equals("yes") && dateOfReturn.isAfter(LocalDate.now()))){

        }
        else (){

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
