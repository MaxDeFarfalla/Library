import java.time.LocalDate;
import java.util.Scanner;

public class BorrowableBook extends Book{
    //Attr
    private LocalDate dateOfReturn;

    //Constr

    public BorrowableBook(){}

    //Meth

    //Checks if book is borrowable and sets returnDate if borrowed
    private void BorrowBook(){
        Scanner bookScanner = new Scanner(System.in);
        boolean borrowable = false;
        String answer;

        generateData();



        if (dateOfReturn == null){
            borrowable = true;

        }

        if(borrowable == true){
            System.out.println("Wish to borrow?");
            answer = bookScanner.nextLine().toLowerCase();
            if (answer == "y" || answer == "yes"){
                dateOfReturn= LocalDate.now().plusDays(20);
            }
        }
        else{
            System.out.println("Not available");
        }

    }

    private void generateData() {
        this.name= "test";
        this.author= new Author();
        this.pages= 1;
    }
    public void borrow() {
    }
}
