public class Book {


    private String title, author, description, isInStock;
    private double price;
//    private boolean isInStock = false;
//you can also auto generate constructors from class
    //default constructor; helps create a object
    public Book(){
    }

    // overloaded constructor; everything on same line
    public Book(String title, String author, String description, double price) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }


    //create getters method
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getDescription(){
        return description;
    }
    public String setisInStock(){
        return isInStock;
    }


    public double getPrice(){
        return price;
    }

    //create setters method
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

    public void setisInStock(String isInStock){
        this.isInStock = isInStock;
    }
    //displaying message
    public String getDisplayText() {
        return  title + "\nAuthor: " + author + "\nDescription:\n" + description +
                "\nPrice: $" + price + "\nIn Stock: " + isInStock;
    }









}
