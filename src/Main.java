import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        ArrayList<Book> books = new ArrayList<>();

        String addBooks = "";

        do{
            Book theBook = new Book();

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter your book title.");
            String bookTitle = userInput.nextLine();
            theBook.setTitle(bookTitle);

            System.out.println("Enter the author of the book.");
            String bookAuthor = userInput.nextLine();
            theBook.setAuthor(bookAuthor);

            System.out.println("Add a brief description of the book.");
            String bookDescription = userInput.nextLine();
            theBook.setDescription(bookDescription);

            System.out.println("Add the price of the book.");
            double bookPrice = userInput.nextDouble();
            theBook.setPrice(bookPrice);


            System.out.println(theBook.getDisplayText());


//            //add another book
//            System.out.println("Do you want to add another book?" + "\n(yes/no)");
//            addBooks = userInput.nextLine();
//
            books.add(theBook);


        }while(addBooks.equalsIgnoreCase("yes"));

//        for (Book item:books){
//            System.out.println(item.getTitle()+ "\n" +item.getAuthor()+ "\n"+
//            item.getDescription()+ "\n___________________________" +
//                    "\n$" + item.getPrice());
//        }
    }
}
