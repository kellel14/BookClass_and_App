import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Book theBook = new Book();

        double bookPrice = 22.45;
        int total_of_books = 5;



//
//        theBook.setTitle("BootCamp");
//        theBook.setAuthor("Kelly F.");
//        theBook.setDescription("Tales of an upcoming developer");
//        theBook.setPrice(7.99);
//        theBook.setisInStock(true);
//        System.out.println("The total book cost is : " + totalPrice);
//
//        System.out.println(theBook.getDisplayText());

//using the overloaded constructor to access parameters. assigned in order


//        String addBooks = "";


//        Random rand = new Random();
//        int total = 0;



        System.out.println ( "These are the books I have\n");

        Book libraryBook_1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Peels away the layers of the glamorous twenties in the U.S. " +
                "to display the coldness and cruelty at its heart.", 22.45, true);
        libraryBook_1.getDisplayText();
        System.out.println("\n");


        Book libraryBook_2 = new Book("The Chosen", "Taran Matharu", "Throughout history, people have vanished with no explanation." +
                " A group of teenagers are about to discover why.", 22.45, true);
        libraryBook_2.getDisplayText();
        System.out.println("\n");

        Book libraryBook_3 = new Book("The Scarlet Letter", "Nathaniel Hawthorne",
                " A young woman is led from the town prison with her infant daughter with the scarlet letter “A” on her breast, " +
                        "represents the act of adultery that she has committed", 22.45, true);
        libraryBook_3.getDisplayText();
        System.out.println("\n");

        Book libraryBook_4 = new Book("The Hobbit", "J.R.R. Tolkien",
                "Oakenshield and his band of dwarves embark upon a dangerous quest to reclaim the hoard of gold stolen from them by the evil dragon Smaug",
                22.45, true);
        libraryBook_4.getDisplayText();
        System.out.println("\n");

        Book libraryBook_6 = new Book("To Kill a Mockingbird", "Harper Lee",
                "honor and injustice in the deep South—and the heroism of one man in the face of blind and violent hatred",
                22.45, true);
        libraryBook_6.getDisplayText();
        System.out.println("\n");


        double totalPrice = total_of_books * bookPrice;
        System.out.println("The total book cost is : " + totalPrice);





    }



}
