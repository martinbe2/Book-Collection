
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
    
    public Book(int id, String nm, String auth, int qty) {
        // initialise instance variables
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        
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
}
