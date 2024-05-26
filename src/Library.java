import java.util.HashMap;
import java.util.Scanner;

public class Library {

    //Hashmap som sparar namnet på boken och boken. Namnet sparas sepparat för att underlätta att söka i hashmapen.
    public HashMap<String, Book> bookHashMap = new HashMap<>();
    private Book book = new Book("t", 1, new Author("t"), new Genre("F"));
    private BorrowableBook borrowableBook;
    private String nameOfBook;
    private boolean borrowable;
    User user = new User("Max");

    public void Start() {
        Scanner libScanner = new Scanner(System.in);
        boolean programRunning = true;


        //Data för tester
        Genre fantasy = new Genre("Fantasy");
        bookHashMap.put("LOTR", new BorrowableBook("Lord Of The Rings", 1, new Author("JRR Tolkien"), fantasy));
        bookHashMap.put("THE COLOUR OF MAGIC", new BorrowableBook("The Colour of magic", 250, new Author("Terry Pratchett"), fantasy));



        //Checks what the user wants to do
        //Switch is used to minimize if statement due to too many options

        while (programRunning) {
            System.out.println("1 - Browse collections");
            System.out.println("2 - Borrow book");
            System.out.println("3 - Return book");
            System.out.println("4 - New book entry");   // Will be altered so that lib personal only
            System.out.println("5 - Exit program");

            //Switch with the different menu options containing methods of each function
            switch (libScanner.next()) {
                case "1" -> {
                    //Method for printing out the hashmap of books
                    writeBooks();
                }
                case "2" -> {
                    //Method for borrowing books
                    //Requires book to be for the borrowable line
                    //if the book is !borrowable the method will suggest to pick another book or return
                    borrowBook();

                }
                case "3" -> {
                    giveBackBook();
                }
                case "4" -> {
                }
                case "5" -> {
                    //ends the program
                    programRunning = false;
                }
                default -> {
                }
            }
        }
        System.out.println("Exiting...");
    }



    //Method that uses for each loop that prints out the booksHashmap
    private void writeBooks() {

        System.out.println("This library currently offers these books in our collection:");
        System.out.println(bookHashMap.keySet());

    }

    private void giveBackBook() {
        System.out.println("You have successfully gained the book back to the collection.");
       //Users books are registered and their return dates are set to null + made available
    }

    //Method for checking if the book that is to be borrowed is a borrowable book
    private void isBorrowableBook() {

        //checks if the book is null and throws the user back
        if (this.book == null) {
            System.out.println("does not exist");
            return;
        }

        //checks that the book is of the BorrowableBook class
        if (book.getClass() == BorrowableBook.class) {
            try {
                borrowableBook = (BorrowableBook) book;
            } catch (Exception e) {
                System.out.println("Book is not borrowable"+ e.getMessage());
            }
        } else {
            System.out.println("sorry this book is not borrowable");
            borrowable = false;

        }
    }

    public BorrowableBook getBorrowableBook() {
        return borrowableBook;
    }

    //
    private void borrowBook() {
        //Ask for book, use answer to get book from hashmap
        Scanner bookScanner = new Scanner(System.in);
        String answer;
        boolean b = true;

        //Check which book is wanted, returns to start if return is typed
        //if book does not exist the user will be returned to the choose book portion

        while (b) {
            Boolean p=false;

            //do while loop so that it runs at least once before continuing
            do {
            System.out.println("What book do you want to borrow?");
            System.out.println("* Type return to return *");
            answer = bookScanner.nextLine().toUpperCase();
            nameOfBook = answer;
            book.name= nameOfBook;


                if ("RETURN".equals(answer)) {
                    System.out.println("Returning...");
                    return;
                }
            //Checks that the book is in the hashmap, if not the user remains in the do-while loop
                //sets Book book to the book from the HashMap
            if(bookHashMap.containsKey(book.getName().toUpperCase())){
                p= false;
                b = false;
                book = bookHashMap.get(nameOfBook);
            }
            else{
                System.out.println(book.getName());
                System.out.println("no book of that name exists");
                p=true;
                }
            } while(p);

        }
        //Sees if the book that is to be borrowed is borrowable
        isBorrowableBook();

        //Checks if the book is available to be borrowed
        //If the book is borrowed then the return date is put with the method setDateOfReturn

        if (borrowableBook.isAvailable()) {


            System.out.println("Wish to borrow? " + borrowableBook.getName() + " of " + borrowableBook.getAuthor().getName());
            System.out.println("y/n");
            answer = bookScanner.nextLine().toLowerCase();

            //Checks if they want to borrow the book
            //If yes/y the book is borrowed and its dateOfReturn is notified

            if (answer.equals("y") || answer.equals("yes")) {
                borrowableBook.setDateOfReturn();
                user.addBorrowedBooks(borrowableBook);
                System.out.println("Hope you enjoy - Book is to be returned at latest " + borrowableBook.getDateOfReturn());

            }else {
                System.out.println("Have a good day");
            }



        }else{
            System.out.println("N/A");
        }
    }


}
