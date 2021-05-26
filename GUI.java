import ecs100.*;
/**
 * Class to handle the GUI functionality
 *
 * @author (your name)
 * @version 27/05/2021
 */
public class GUI
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        Books bk = new Books();
        UI.initialise();
        UI.addButton("Print all", bk::printAll);
        UI.addButton("Add a book", bk::addBook);
        UI.addButton("Find a book", bk::findBook);
        UI.addButton("Quit", bk::exitProgram);
    }
}
