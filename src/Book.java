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
    }


    //create getters method for private variables
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getDescription(){
        return this.description;
    }
    public boolean setisInStock(){
        return this.isInStock;
    }


    public double getPrice(){
        return price;
    }

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
    public String getDisplayText() {
        return  title + "\nAuthor: " + author + "\nDescription:\n" + description +
                "\nPrice: $" + price + "\nIn Stock: " + isInStock;
    }









}
