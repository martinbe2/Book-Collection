import ecs100.*;
/**
 * Support class for book
 * A book contains an ID, name, author, quantity, image
 *
 * @author (your name)
 * @version 27/05/2021
 */
public class Book
{
    // fields
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;
    private static final String DEFAULT_IMAGE = "book.png";
    
    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty, String img) {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }
    
    /**
     * Constructor overloading
     * Set default image to obj
     */
    public Book(int id, String nm, String auth, int qty) {
        this(id, nm, auth, qty, DEFAULT_IMAGE); 
    }
    
    /**
     * getter for id
     * 
     * @return int id
     */
    public int getID() {
        return this.id;
    }
    
    /**
     * getter for nm
     * 
     * @return String nm
     */
    public String getNm() {
        return this.name;
    }
    
    /**
     * getter for auth
     * 
     * @return String auth
     */
    public String getAuth() {
        return this.author;
    }
    
    /**
     * getter for qty
     * 
     * @return int qty
     */
    public int getQty() {
        return this.quantity;
    }
    
    /**
     * Display our image on the GUI
     */
    public void displayBook() {
        double locX = 100;
        double locY = 100;
        final double WIDTH = 100;
        final double HEIGHT = 100;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
}
