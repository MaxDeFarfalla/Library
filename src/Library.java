import java.util.HashMap;
import java.util.Scanner;

public class Library {

        //Hashmap som sparar namnet på boken och boken. Namnet sparas sepparat för att underlätta att söka i hashmapen.
    public HashMap<String, Book> bookHashMap= new HashMap<>();
    private Book book = new Book("t",1,new Author("t"),new Genre("F"));
    private BorrowableBook borrowableBook;
    private String nameOfBook;
    private boolean b;


    public void Start() {
        Scanner libScanner = new Scanner(System.in);

  /*
  //test code
     BorrowableBook b = new BorrowableBook();
     b.borrow();
*/

        //Data för tester

        Genre fantasy = new Genre("Fantasy");

        bookHashMap.put("LOTR" , new BorrowableBook("Lord Of The Rings", 1, new Author("JRR Tolkien"), fantasy));
        bookHashMap.put("THE COLOUR OF MAGIC" ,new BorrowableBook("The Colour of magic", 250, new Author("Terry Pratchett"), fantasy));

        System.out.println(bookHashMap);

        boolean programRunning = true;

        //Checks what the user wants to do
        //Switch is used to minimize if statement due to too many options

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
                    //check if book is borrowableBook


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

    private void isBorrowableBook() {
        if (book.getClass() == BorrowableBook.class){
            try {
                borrowableBook = (BorrowableBook) book;
            }catch (ClassCastException e){ }
        }
        else{
            System.out.println("sorry this book is not borrowable");
        }
    }

  //
   private void borrowBook() {
        //Ask for book, use answer to get book from hashmap
        Scanner bookScanner = new Scanner(System.in);
        String answer;
        boolean b= true;


        //Check which book is wanted

        while (b) {
            System.out.println("What book do you want to borrow");
            System.out.println("* Type return to return *");
            answer = bookScanner.nextLine().toUpperCase();
            nameOfBook = answer;
            book = bookHashMap.get(nameOfBook);

            if ("RETURN".equals(answer)) {
                return;
            }

            b= false;
        }
         //Sees if the book that is to be borrowed is borrowable
            isBorrowableBook();

       if (!borrowableBook.isAvailable()){
           System.out.println("Not available - Have a good day");
       }
       System.out.println(borrowableBook.isAvailable());

       //Kollar om boken är tillgänglig för att bli lånad
       //If the book is borrowed then the return date is put with the method setDateOfReturn

       if (borrowableBook.isAvailable()){

            System.out.println("Wish to borrow? " + borrowableBook.getName() + " of " + borrowableBook.getAuthor().getName());
            System.out.println("y/n");
            answer = bookScanner.nextLine().toLowerCase();

            if (answer.equals("y") || answer.equals("yes")) {

               borrowableBook.setDateOfReturn();
                System.out.println("Hope you enjoy - Book is to be returned at latest " + borrowableBook.getDateOfReturn());
                System.out.println(borrowableBook.isAvailable());

            } else {
                System.out.println("Have a good day");
            }

       }




    }


}
