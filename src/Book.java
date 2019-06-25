public class Book {


    private String title, author, description;
    private double price;
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
    }
    public String getDisplayText() {
        return  title + "\nAuthor: " + author + "\nDescription:\n" + description +
                "\nPrice: $" + price;
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









}
