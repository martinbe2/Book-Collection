import java.util.HashMap;
import ecs100.*;
/**
 * Holds a collection of books in a hashmap
 * Allows a user to add, find, print all, and edit from a menu
 * 
 *
 * @author (your name)
 * @version 27/05/2021
 */
public class Books
{
    // fields
    private HashMap<Integer, Book> booksMap; // declaring the hashmap
    private int currentBookID;  // store the current ID of the book being added
    
    public Books() {
        // initialise instance variables
        booksMap = new HashMap<Integer, Book>();    // initialise hashmap
        
        // creating books
        Book b1 = new Book(1, "The Hobbit", "J.R.R Tolkien", 20);
        Book b2 = new Book(2, "Animal Farm", "George Orwell", 32);
        Book b3 = new Book(3, "Inferno", "Dan Brown", 69);
        Book b4 = new Book(4, "Cat Country", "Lao She", 2);
        
        // add books to the hashmap
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        booksMap.put(4, b4);
        
        this.currentBookID = 4;     // initialise the book ID
        
        this.menu();
    }
    
    /**
     * Menu to print and call appropriate methods
     */
    public void menu() {
        // print menu and force choice
        String choice;
        do {
            UI.println("(A) Add a book");
            UI.println("(B) Find a book");
            UI.println("(C) Print All");
            UI.println("(D) Quit");
            
            choice = UI.askString("Enter a choice: ");
            
            if (choice.equalsIgnoreCase("A")) {
                addBook();
            }
            else if (choice.equalsIgnoreCase("B")) {
                findBook();
            }
            else if (choice.equalsIgnoreCase("C")) {
                printAll();
            }
            else if (choice.equalsIgnoreCase("D")) {
                UI.println("Arrivederci");
                UI.quit();
            }
            else {
                UI.println("That isn't a valid choice buddy...");
            }
        }
        while (!choice.equalsIgnoreCase("D"));
    }
    
    /**
     * Adds a book to the map
     */
    public void addBook() {
        final int MAX_QUANTITY = 99;    // boundary for number of books
        int quantity = -1;
        
        // ask the user for details
        String name = UI.askString("Title: ");
        String author = UI.askString("Author: ");
        
        // check the boundaries for the number of books added to the stock
        do {
            quantity = UI.askInt("Quantity: ");
        }
        while (0 > quantity || quantity > MAX_QUANTITY);
        
        // increment the bookID counter and add book to the hashmap
        this.currentBookID++;
        booksMap.put(currentBookID, new Book(currentBookID, name, author, quantity));
    }
    
    /**
     * Finds a book based on the ID
     * Should refactor to find on name
     */
    public void findBook() {
        int bookID = UI.askInt("ID: "); // find book on ID - change to title
        UI.println(booksMap.get(bookID).getNm());
    }
    
    /**
     * Prints detail of all books
     */
    public void printAll() {
        for (int bookID : booksMap.keySet()) {
            UI.println(bookID + " Details: ");
            UI.println(booksMap.get(bookID).getNm() + " "
            + booksMap.get(bookID).getAuth() + " "
            + booksMap.get(bookID).getQty());
        }
    }
}
