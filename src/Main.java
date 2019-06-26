public class Main {
    public static void main (String [] args) {

        Book theBook = new Book();

        theBook.setTitle("BootCamp");


        theBook.setAuthor("Kelly F.");

        theBook.setDescription("Tales of an upcoming developer");

        theBook.setPrice(7.99);

        theBook.setisInStock(true);


        System.out.println(theBook.getDisplayText());
    }



}
