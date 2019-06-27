public class Book {


    private String title, author, description;
    private double price;
    private boolean isInStock;
//you can also auto generate constructors from class
    //default constructor; helps create a object
    public Book(){
    }

    // overloaded constructor; everything on same line
    public Book(String title, String author, String description, double price,
               boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
//        this.priceTotal = priceTotal;
    }


    //create getters method for private variables
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getDescription(){
        return description;
    }
    public boolean setisInStock(){
        return isInStock;
    }


    public double getPrice(){
        return price;
    }

//    public double priceTotal(){
//        return priceTotal;
//    }

    //create setters method for private variables
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setisInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    //displaying message
    public void getDisplayText() {
//        return  title + "\nAuthor: " + author + "\nDescription:\n" + description +
//                "\nPrice: $" + price + "\nIn Stock: " + isInStock;

        System.out.println("Author: " + this.author + " " + "Title : " + this.title + " " + " Description : "
                + this.description + " " + "Price : " + this.price + " " + "IsinStock: " + this.isInStock);
    }


//    //calculate total price of all books
//    public void setpriceTotal (double priceTotal){
//        this.priceTotal = price++ ;
//    }
//    // display total price
//    public double DisplayTotalPrice(){
//        return priceTotal;
//    }




}
