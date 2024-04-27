import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Library {


    public static HashMap<String, Book> bookHashMap= new HashMap<>();
    static Book book;
    static String nameOfBook;

    public static void Start() {
        Scanner libScanner = new Scanner(System.in);

  /*
  //test code
     BorrowableBook b = new BorrowableBook();
     b.borrow();
*/

        //Data för tester

        Genre fantasy = new Genre("Fantasy");

        bookHashMap.put("LOTR" , new BorrowableBook("Lord Of The Rings", 0, new Author("JRR Tolkien"), new Genre[]{fantasy}));
        bookHashMap.put("The Colour of magic" ,new BorrowableBook("The Colour of magic", 250, new Author("Terry Pratchett"), new Genre[]{fantasy}));

        System.out.println(bookHashMap);

        boolean programRunning = true;

        //Kollar vad användaren vill göra
        //Switch används för att underlätta vid alla alternativ

        while (programRunning) {
            System.out.println("1 - Browse collections");
            System.out.println("2 - Borrow book");
            System.out.println("3 - Return book");
            System.out.println("4 - New book entry");   // Will be altered so that lib personal only
            System.out.println("5 - Exit program");

            switch (libScanner.next()) {
                case "1" -> {

                }
                case "2" -> {
                 borrowBook();
                }
                case "3" -> {
                }
                case "4" -> {
                }
                case "5" -> {
                    programRunning = false;
                }
                default -> {
                }
            }
        }
        System.out.println("Exiting...");
    }


    public static void borrowBook() {
        //Ask for book, use answer to get book from hashmap
        Scanner bookScanner = new Scanner(System.in);
        String answer;


        //Check which book is wanted

        while (true) {
            System.out.println("What book do you want to borrow");
            System.out.println("* Type return to return *");
            answer = bookScanner.nextLine().toLowerCase();
            nameOfBook = answer;
            book = bookHashMap.get(nameOfBook);

            if (answer.equals("return")) {
                return;
            }

            //books
        }
         //Sees if the book that is to be borrowed is borrowable
        if (book.getClass() == BorrowableBook.class) {

            System.out.println("Wish to borrow? " + book.getName() + " of " + book.getAuthor().getName());
            answer = bookScanner.nextLine().toLowerCase();

            if (answer.equals("y") || answer.equals("yes")) {
                book.setDateOfReturn() = LocalDate.now().plusDays(20);

                System.out.println("Hope you enjoy - Book is to be returned at latest " + book.getDateOfReturn());
            } else {
                System.out.println("Have a good day");
            }

        } else {
            System.out.println("Not available - Have a good day");
        }

    }


}
