import java.util.Scanner;

public class Library {

    public static void Start(){
        Scanner libScanner = new Scanner(System.in);
        String libAnswer = libScanner.next().toLowerCase();
  /*
  //test code
     BorrowableBook b = new BorrowableBook();
     b.borrow();
*/

        System.out.println("1 - Browse collections");
        System.out.println("2 - Borrow book");
        System.out.println("3 - Return book");
        System.out.println("4 - New book entry");   // Will be altered so that lib personal only

        switch (libAnswer){
            case "1":

                break;

            case "2":

                break;

            case "3":

                break;

            case "4":

                break;
        }

    }
}
